package com.example.alextarasyuk.collectionsandmaps.model;

import com.example.alextarasyuk.collectionsandmaps.fragments.MainActivity;
import com.example.alextarasyuk.collectionsandmaps.model.ICalculation;
import com.example.alextarasyuk.collectionsandmaps.model.ListCalculation;
import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

public final class Calculation {

    private ICalculation calculation;
    private Presenter presenter;
    private static Calculation instatce;
    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private List<Integer> writeOnWriteLinkedList;
    private Map<Integer, Integer> hashMap;
    private Map<Integer, Integer> treeMap;
    private int size;

    private Calculation() {
    }
    public static synchronized  Calculation  createInstance(){
        if (instatce!=null){
            return instatce;
        }
        return new Calculation();
    }






    private void initializeMap() {
        Random random = new Random();


        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            hashMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));
            treeMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));

        }
    }

    void initialzeList() {
        presenter = Presenter.createPresenter();

        this.size = presenter.getSize();
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        writeOnWriteLinkedList = new CopyOnWriteArrayList<>();
        Random random = new Random();

        for (
                int i = 0;
                i < size - 1; i++)

        {
            arrayList.add(random.nextInt(100_000));
            linkedList.add(random.nextInt(100_000));
            writeOnWriteLinkedList.add(random.nextInt(100_000));
        }

    }

    public Queue<Long> getResultQueueList() throws ExecutionException, InterruptedException {
        initialzeList();
        Queue<Long> resultQueue = new PriorityQueue<>();

        calculation = new ListCalculation(arrayList);
        resultQueue.addAll(calculation.calculateList());
        calculation = new ListCalculation(linkedList);
        resultQueue.addAll((calculation).calculateList());
        calculation = new ListCalculation(writeOnWriteLinkedList);
        resultQueue.addAll(calculation.calculateList());

        return resultQueue;


    }

    public Queue<Long> getResultQueueMap() throws ExecutionException, InterruptedException {
        initializeMap();
        Queue<Long> resultQueue = new PriorityQueue<>();
        calculation = new MapCalculation(hashMap);
        resultQueue.addAll(calculation.calculateMap());
        calculation = new MapCalculation(treeMap);
        resultQueue.addAll(calculation.calculateMap());

        return resultQueue;
    }
}

