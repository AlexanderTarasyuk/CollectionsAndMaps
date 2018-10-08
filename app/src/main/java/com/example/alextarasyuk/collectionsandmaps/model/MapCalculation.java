package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

import timber.log.Timber;

public class MapCalculation implements ICalculation{

    Map<Integer, Integer> map;



    public MapCalculation(Map<Integer, Integer> map) {
        this.map = map;
    }

    public long calculateAddNewElementToMap() throws ExecutionException, InterruptedException {

        AddNewElementToMap myAsynkTask4 = new AddNewElementToMap();
        myAsynkTask4.execute();
        return myAsynkTask4.get();
    }

    public long calculateFindElementInMapByKey() throws ExecutionException, InterruptedException {
        FindElementInMapByKey findElementInMap = new FindElementInMapByKey();
        findElementInMap.execute();
        return findElementInMap.get();
    }

    public long calculateRemoveElementInMapByKey() throws ExecutionException, InterruptedException {
        RemoveElementInMap removeElementInMap = new RemoveElementInMap();
        removeElementInMap.execute();
        return removeElementInMap.get();
    }

    @Override
    public Queue<Long> calculateList() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override
    public Queue<Long> calculateMap() throws ExecutionException, InterruptedException {
        Queue<Long> longs=new PriorityQueue<>();
        longs.add(calculateAddNewElementToMap());
        longs.add(calculateFindElementInMapByKey());
        longs.add(calculateRemoveElementInMapByKey());
        return longs;

    }

    public class AddNewElementToMap extends AsyncTask<Void, Void, Long> {

        @Override
        protected Long doInBackground(Void... voids) {
//            Timber.d(map.getClass().getSimpleName() + "" +map.size() + " add ");
            long temp = System.nanoTime();
            map.put(new Integer(1), 1);
            return (System.nanoTime() - temp);
        }
    }

    public class FindElementInMapByKey extends AsyncTask<Void, Void, Long> {
        @Override
        protected Long doInBackground(Void... voids) {
            Timber.d(map.getClass().getSimpleName() + "" + map.size() + " find  ");
            long temp = System.nanoTime();
            map.get(123);
            return (System.nanoTime() - temp);
        }
    }

    public class RemoveElementInMap extends AsyncTask<Void, Void, Long> {

        @Override
        protected Long doInBackground(Void... voids) {
            Timber.d(map.getClass().getSimpleName() + "" + map.size() + " delete  ");
            long temp = System.nanoTime();
            map.remove(123);
            return (System.nanoTime() - temp);
        }
    }
}
