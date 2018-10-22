package com.example.alextarasyuk.collectionsandmaps.presenter;

import com.example.alextarasyuk.collectionsandmaps.contract.Contract;
import com.example.alextarasyuk.collectionsandmaps.model.MapCalculation;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

public final class MapPresenterImpl implements Contract.MapPresenter {
    private Contract.View view;
    private Contract.MapModel mapModel;

    private Map<Integer, Integer> hashMap;
    private Map<Integer, Integer> treeMap;

//    private static volatile MapPresenterImpl mapPresenter;

    public Contract.View getView() {
        return view;
    }

    public MapPresenterImpl() {
        mapModel = MapCalculation.getMapCalculationSingleTon();
    }

//    public static MapPresenterImpl getMapPresenterSingleton() {
//        if (mapPresenter == null) {
//            synchronized (MapPresenterImpl.class) {
//                mapPresenter = new MapPresenterImpl();
//            }
//        }
//        return mapPresenter;
//    }


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
            hashMap.put(i, random.nextInt(100_000));
            treeMap.put(i, random.nextInt(100_000));
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
