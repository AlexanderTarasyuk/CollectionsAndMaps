package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import com.example.alextarasyuk.collectionsandmaps.contract.Contract;

import java.util.Map;
import java.util.concurrent.ExecutionException;

public class MapCalculation implements Contract.MapModel {

    private Map map;

    public MapCalculation(Map<Integer, Integer> map) {
        this.map = map;
    }

    @Override
    public String calculateAddNewElementToMap() throws ExecutionException, InterruptedException {

        AddNewElementToMap myAsynkTask4 = new AddNewElementToMap();
        myAsynkTask4.execute();

        return String.valueOf(myAsynkTask4.get());
    }

    @Override
    public String calculateFindElementInMapByKey() throws ExecutionException, InterruptedException {
        FindElementInMapByKey findElementInMap = new FindElementInMapByKey();
        findElementInMap.execute();
        return String.valueOf(findElementInMap.get());
    }

    @Override
    public String calculateRemoveElementInMapByKey() throws ExecutionException, InterruptedException {
        RemoveElementInMap removeElementInMap = new RemoveElementInMap();
        removeElementInMap.execute();
        return String.valueOf(removeElementInMap.get());
    }


    public class AddNewElementToMap extends AsyncTask<Void, Void, Long> {

        @Override
        protected Long doInBackground(Void... voids) {

            long temp = System.nanoTime();
            map.put(new Integer(1), 1);
            return (System.nanoTime() - temp);
        }
    }

    public class FindElementInMapByKey extends AsyncTask<Void, Void, Long> {
        @Override
        protected Long doInBackground(Void... voids) {

            long temp = System.nanoTime();
            map.get(123);
            return (System.nanoTime() - temp);
        }
    }

    public class RemoveElementInMap extends AsyncTask<Void, Void, Long> {

        @Override
        protected Long doInBackground(Void... voids) {

            long temp = System.nanoTime();
            map.remove(123);
            return (System.nanoTime() - temp);
        }
    }
}
