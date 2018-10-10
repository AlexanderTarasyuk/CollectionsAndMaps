package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import timber.log.Timber;

public class MapCalculation {

    private Map map;

    public MapCalculation(Map map) {
        this.map = map;
    }

    public String calculateAddNewElementToMap() throws ExecutionException, InterruptedException {

        AddNewElementToMap myAsynkTask4 = new AddNewElementToMap();
        myAsynkTask4.execute();

        return String.valueOf(myAsynkTask4.get());
    }

    public String calculateFindElementInMapByKey() throws ExecutionException, InterruptedException {
        FindElementInMapByKey findElementInMap = new FindElementInMapByKey();
        findElementInMap.execute();
        return String.valueOf(findElementInMap.get());
    }

    public String calculateRemoveElementInMapByKey() throws ExecutionException, InterruptedException {
        RemoveElementInMap removeElementInMap = new RemoveElementInMap();
        removeElementInMap.execute();
        return String.valueOf(removeElementInMap.get());
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
