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

    private Contract.MapModel treeMapModel;
    private Contract.MapModel hashMapModel;

    public MapPresenter(int size) {
        initializeMap(size);
    }


    @Override
    public void attachView(Contract.View view) {
        this.view = view;
        hashMapModel = new MapCalculation(hashMap);
        treeMapModel = new MapCalculation(treeMap);

    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void calculateAddNewElementToHashMap() {
        try {
            view.setAddNewInHashMap(hashMapModel.calculateAddNewElementToMap());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateFindElementInHashMapByKey() {
        try {
            view.setSelectInHashMap(hashMapModel.calculateFindElementInMapByKey());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateRemoveElementInHashMapByKey() {
        try {
            view.setRemoveInHashMap(hashMapModel.calculateRemoveElementInMapByKey());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateAddNewElementToTreeMap() {
        try {
            view.setAddNewInTreeMap(treeMapModel.calculateAddNewElementToMap());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void calculateFindElementInTreeMapByKey() {

        try {
            view.setSelectInTreeMap(treeMapModel.calculateFindElementInMapByKey());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calculateRemoveElementInTreeMapByKey() {
        try {
            view.setRemoveInTreeMap(treeMapModel.calculateRemoveElementInMapByKey());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void initializeMap(Integer size) {
        Random random = new Random();
        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            hashMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));
            treeMap.put(new Integer(random.nextInt(100_000)), random.nextInt(100000));

        }
    }
}
