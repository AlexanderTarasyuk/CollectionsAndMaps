package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import com.example.alextarasyuk.collectionsandmaps.Utils;
import com.example.alextarasyuk.collectionsandmaps.contract.Contract;

import java.util.Map;
import java.util.concurrent.ExecutionException;

public final class MapCalculation implements Contract.MapModel {

    private static MapCalculation mapCalculation;

    private MapCalculation() {
    }

    public static MapCalculation getMapCalculationSingleTon() {

        synchronized (MapCalculation.class) {
            if (mapCalculation != null) {
                return mapCalculation;
            } else {
                return new MapCalculation();
            }
        }
    }

    @Override
    public String calculateAddNewElementToMap(Map<Integer, Integer> map) throws ExecutionException, InterruptedException {

        return new AddNewElementToMap().executeOnExecutor(Utils.getExecutorService(), map).get();
    }

    @Override
    public String calculateFindElementInMapByKey(Map<Integer, Integer> map) throws ExecutionException, InterruptedException {
        return new FindElementInMapByKey().executeOnExecutor(Utils.getExecutorService(), map).get();
    }

    @Override
    public String calculateRemoveElementInMapByKey(Map<Integer, Integer> map) throws ExecutionException, InterruptedException {
        return new RemoveElementInMap().executeOnExecutor(Utils.getExecutorService(), map).get();
    }


    public static class AddNewElementToMap extends AsyncTask<Map<Integer, Integer>, Void, String> {

        @Override
        protected String doInBackground(Map... voids) {

            long temp = System.nanoTime();
            voids[0].put(new Integer(1), 1);
            return String.valueOf(System.nanoTime() - temp);
        }
    }

    public static class FindElementInMapByKey extends AsyncTask<Map<Integer, Integer>, Void, String> {

        @Override
        protected String doInBackground(Map... voids) {

            long temp = System.nanoTime();
            voids[0].get(11);
            return String.valueOf(System.nanoTime() - temp);
        }
    }

    public static class RemoveElementInMap extends AsyncTask<Map<Integer, Integer>, Void, String> {

        @Override
        protected String doInBackground(Map... voids) {


            long temp = System.nanoTime();
            voids[0].remove(11);
            return String.valueOf(System.nanoTime() - temp);
        }
    }
}

