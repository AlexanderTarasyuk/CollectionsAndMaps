package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import com.example.alextarasyuk.collectionsandmaps.Utils;
import com.example.alextarasyuk.collectionsandmaps.contract.Contract;

import java.util.List;
import java.util.concurrent.ExecutionException;

public final class ListCalculation implements Contract.ListModel {

    private static volatile ListCalculation listCalculation;

    private ListCalculation() {
    }

    public static ListCalculation getListCalculationSingleton() {

        if (listCalculation == null) {
            synchronized (ListCalculation.class) {
                listCalculation = new ListCalculation();
            }
        }
        return listCalculation;

    }


    @Override
    public String calculateInsertAtTheBeginning(List<Integer> list) throws ExecutionException, InterruptedException {
        InsertAddTheBeginning task = new InsertAddTheBeginning();

        return task.executeOnExecutor(Utils.getExecutorService(), list).get();


    }

    static class InsertAddTheBeginning extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].add(0, 1000);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }
    }

    @Override
    public String calculateInsertAtTheMiddle(List<Integer> list) throws ExecutionException, InterruptedException {

        InsertAddTheMiddle task = new InsertAddTheMiddle();
        return task.executeOnExecutor(Utils.getExecutorService(), list).get();
    }


    static class InsertAddTheMiddle extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].add(voids[0].size() / 2, 1000);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }
    }

    @Override
    public String calculateInsertAtTheEnd(List<Integer> list) throws ExecutionException, InterruptedException {

        return new InsertAddTheEnd().executeOnExecutor(Utils.getExecutorService(), list).get();

    }

    static class InsertAddTheEnd extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].add(voids[0].size() - 1, 1000);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }
    }

    @Override
    public String calculateFindTheIndexOfElement(List<Integer> list) throws ExecutionException, InterruptedException {

        return new FindTheIndex().executeOnExecutor(Utils.getExecutorService(), list).get();
    }

    static class FindTheIndex extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].indexOf(100);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }
    }

    @Override
    public String calculateRemoveFirstElement(List<Integer> list) throws ExecutionException, InterruptedException {
        return new DeleteFirstInList().executeOnExecutor(Utils.getExecutorService(), list).get();
    }

    static class DeleteFirstInList extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].remove(0);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }
    }


    @Override
    public String calculateRemoveMiddleElementArrayList(List<Integer> list) throws ExecutionException, InterruptedException {
        return new DeleteMiddleInList().executeOnExecutor(Utils.getExecutorService(), list).get();
    }

    static class DeleteMiddleInList extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].remove(voids[0].size() / 2);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }
    }

    @Override
    public String calculateRemoveLastElement(List<Integer> list) throws ExecutionException, InterruptedException {
        return new DeleteLastInList().executeOnExecutor(Utils.getExecutorService(), list).get();
    }

    static class DeleteLastInList extends AsyncTask<List, Void, String> {
        @Override
        protected String doInBackground(List... voids) {
            long temp = System.nanoTime();
            voids[0].remove(voids[0].size() - 1);
            long time = System.nanoTime() - temp;
            return String.valueOf(time);
        }

    }

}
