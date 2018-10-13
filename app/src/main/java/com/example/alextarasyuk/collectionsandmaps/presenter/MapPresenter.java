package com.example.alextarasyuk.collectionsandmaps.presenter;

import com.example.alextarasyuk.collectionsandmaps.contract.Contract;
import com.example.alextarasyuk.collectionsandmaps.model.MapCalculation;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

public class MapPresenter implements Contract.MapPresenter {
    private Contract.View view;
    private Map<Integer, Integer> hashMap;
    private Map<Integer, Integer> treeMap;

    private Contract.MapModel mapModel;


    public MapPresenter() {

        mapModel = new MapCalculation();
    }


    @Override
    public void calculateAddNewElementToHashMap() {
        try {
            view.setAddNewInHashMap(mapModel.calculateAddNewElementToMap(hashMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateFindElementInHashMapByKey() {
        try {
            view.setSelectInHashMap(mapModel.calculateFindElementInMapByKey(hashMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateRemoveElementInHashMapByKey() {
        try {
            view.setRemoveInHashMap(mapModel.calculateRemoveElementInMapByKey(hashMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateAddNewElementToTreeMap() {
        try {
            view.setAddNewInTreeMap(mapModel.calculateAddNewElementToMap(treeMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateFindElementInTreeMapByKey() {

        try {
            view.setSelectInTreeMap(mapModel.calculateFindElementInMapByKey(treeMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateRemoveElementInTreeMapByKey() {
        try {
            view.setRemoveInTreeMap(mapModel.calculateRemoveElementInMapByKey(treeMap));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initializeMap(Integer size) {
        Random random = new Random();
        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            hashMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));
            treeMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));

        }
    }


    @Override
    public void attachView(Contract.View view) {
        this.view = view;


    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
