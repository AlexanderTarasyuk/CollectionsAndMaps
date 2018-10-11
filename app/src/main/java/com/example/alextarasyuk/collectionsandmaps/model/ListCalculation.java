package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import com.example.alextarasyuk.collectionsandmaps.contract.Contract;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class ListCalculation implements Contract.ListModel {


    @Override
    public String calculateInsertAtTheBeginning(List<Integer> list) throws ExecutionException, InterruptedException {

        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.add(0, 1000);
                return String.valueOf(System.nanoTime() - temp);
            }
        }.execute().get();

    }

    @Override
    public String calculateInsertAtTheMiddle(List<Integer> list) throws ExecutionException, InterruptedException {
        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.add(list.size() / 2, 1000);
                return String.valueOf((System.nanoTime() - temp));
            }

        }.execute().get();
    }

    @Override
    public String calculateInsertAtTheEnd(List<Integer> list) throws ExecutionException, InterruptedException {

        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.add(list.size() - 1, 1000);
                return String.valueOf((System.nanoTime() - temp));
            }

        }.execute().get();

    }

    @Override
    public String calculateFindTheIndexOfElement(List<Integer> list) throws ExecutionException, InterruptedException {

        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.indexOf(100);
                return String.valueOf((System.nanoTime() - temp));
            }

        }.execute().get();
    }

    @Override
    public String calculateRemoveFirstElement(List<Integer> list) throws ExecutionException, InterruptedException {
        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.remove(1);
                return String.valueOf((System.nanoTime() - temp));
            }

        }.execute().get();
    }

    @Override
    public String calculateRemoveMiddleElementArrayList(List<Integer> list) throws ExecutionException, InterruptedException {
        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.remove(list.size() / 2);
                return String.valueOf((System.nanoTime() - temp));
            }

        }.execute().get();
    }

    @Override
    public String calculateRemoveLastElement(List<Integer> list) throws ExecutionException, InterruptedException {
        return new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.remove((list.size() - 1));
                return String.valueOf((System.nanoTime() - temp));
            }

        }.execute().get();
    }

}
