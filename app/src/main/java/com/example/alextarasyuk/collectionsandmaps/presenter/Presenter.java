package com.example.alextarasyuk.collectionsandmaps.presenter;

import com.example.alextarasyuk.collectionsandmaps.fragments.IViewInterface;
import com.example.alextarasyuk.collectionsandmaps.fragments.ListFragment;
import com.example.alextarasyuk.collectionsandmaps.fragments.MainActivity;
import com.example.alextarasyuk.collectionsandmaps.fragments.MainActivityInterface;
import com.example.alextarasyuk.collectionsandmaps.fragments.MapFragment;
import com.example.alextarasyuk.collectionsandmaps.model.Calculation;
import com.example.alextarasyuk.collectionsandmaps.model.ICalculation;

import java.util.Queue;
import java.util.concurrent.ExecutionException;

public final class Presenter implements MainActivityInterface {


    private IViewInterface iViewInterface;
    private static Presenter presenter;
    private int size;
    private Calculation calculation;

    private Queue<Long> longQueueList;
    private Queue<Long> longQueueMap;

    private Presenter() {
    }

    public static synchronized Presenter createPresenter(){
        if (presenter!=null){
            return presenter;
        }
        return new Presenter();
    }



    public Queue<Long> getLongQueueList() {
        return longQueueList;
    }

    public Queue<Long> getLongQueueMap() {
        return longQueueMap;
    }

    public void calculatePresenter() {
        calculation = Calculation.createInstance();
        try {
            longQueueList = calculation.getResultQueueList();
            longQueueMap = calculation.getResultQueueMap();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ListFragment listFragment = new ListFragment();
        listFragment.calculate();
        MapFragment mapFragment = new MapFragment();
        mapFragment.calculate();


    }


    @Override
    public void setSize(int size) {
        this.size = size;

    }

    public int getSize() {
        return this.size;
    }
}
