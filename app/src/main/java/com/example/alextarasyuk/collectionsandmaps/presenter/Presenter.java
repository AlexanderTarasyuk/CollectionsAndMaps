package com.example.alextarasyuk.collectionsandmaps.presenter;


import com.example.alextarasyuk.collectionsandmaps.fragments.IListFragment;

import com.example.alextarasyuk.collectionsandmaps.fragments.ListFragment;
import com.example.alextarasyuk.collectionsandmaps.fragments.MainActivity;
import com.example.alextarasyuk.collectionsandmaps.fragments.MapFragment;
import com.example.alextarasyuk.collectionsandmaps.model.ListCalculation;
import com.example.alextarasyuk.collectionsandmaps.model.MapCalculation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;


public final class Presenter {

    private MainActivity mainActivity;
    IListFragment iListFragment;
    private ListFragment listFragment;
    private MapFragment mapFragment;
    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private List<Integer> writeOnWriteLinkedList;
    private Map<Integer, Integer> hashMap;
    private Map<Integer, Integer> treeMap;
    private ListCalculation listCalculation;
    private MapCalculation mapCalculation;

    public Presenter() {
    }

    public void initializeMap(Integer size) {
        Random random = new Random();


        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            hashMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));
            treeMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));

        }
    }

    public void initialzeList(Integer size) {
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


    public void calculateTableContentInPresenter(Integer size) {
        initialzeList(size);
        initializeMap(size);
        iListFragment = new ListFragment();
        listCalculation = new ListCalculation(arrayList, this);

        try {

            calculateContentInRepositoryArrayList(this.arrayList, this);


        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void calculateContentInRepositoryArrayList(List arrayList, Presenter presenter) throws ExecutionException, InterruptedException {
        listCalculation.calculateInsertAtTheBeginningListArrayList(arrayList);
        listCalculation.calculateListInsertAtTheMiddleArrayList(arrayList);
        listCalculation.calculateListInsertAtTheEndArrayList(arrayList);
        listCalculation.calculateFindTheIndexOfElement(arrayList);
        listCalculation.calculateRemoveFirstElementArrayList(arrayList);
        listCalculation.calculateRemoveMiddleElementArrayList(arrayList);
        listCalculation.calculateRemoveLastElementatArrayList(arrayList);
    }


    public void attachView(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        mapFragment = new MapFragment();
        listFragment = new ListFragment();
    }

    public void dettachView() {
        mainActivity = null;
        mapFragment = null;
        listFragment = null;
    }

    public void getContentAddAtTheBeginningArList(String s) {
        iListFragment.setTvInsertAtBeginningArrayList(s);
    }

    public void getContentAddAtTheMiddleArList(String s) {
        iListFragment.setTvInsertAtMiddleArrayList(s);
    }

    public void getContentFindElementArrayList(String s) {
        iListFragment.setTvFindElementArrayList(s);
    }

    public void getContentOfDeleteFirstElementArrayList(String s) {
        iListFragment.setTvDeleteFirstArrayList(s);
    }

    public void getContentOfDeleteLastElementArrayList(String s) {
        iListFragment.setTvDeleteLastElementArrayList(s);
    }


    public void getContentAddatTheEndArrayList(String s) {
        iListFragment.setTvInsertAtEndArrayList(s);
    }

    public void getContentAddAtTheBeginningLinkedList() {

    }

    public void getContentAddAtTheBeginningCopyOnWriteList(String s) {
        iListFragment.setTvInsertAtBeginningCopyOnWriteList(s);
    }
}
