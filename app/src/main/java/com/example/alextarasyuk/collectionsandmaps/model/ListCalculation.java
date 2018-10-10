package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class ListCalculation {

    private  Presenter  presenter;
    private  List<Integer> list;

    public ListCalculation(List<Integer> list, Presenter presenter) {
        this.list = list;
        this.presenter = presenter;
    }

    public   void  calculateInsertAtTheBeginningListArrayList(List<Integer> list) throws ExecutionException, InterruptedException {

        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.add(0, 1000);
                return (System.nanoTime() - temp);
            }

            @Override
            protected void onPostExecute(Long aLong) {
               presenter.getContentAddAtTheBeginningArList(String.valueOf(aLong));
            }
        }.execute();

    }

    public  void calculateListInsertAtTheMiddleArrayList(List<Integer> list) {
        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.add(list.size() / 2, 1000);
                return (System.nanoTime() - temp);
            }

            @Override
            protected void onPostExecute(Long aLong) {
                presenter.getContentAddAtTheMiddleArList(String.valueOf(aLong));
            }
        }.execute();
    }

    public  void calculateListInsertAtTheEndArrayList(List<Integer> list) {

        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.add(list.size()  -1, 1000);
                return (System.nanoTime() - temp);
            }

            @Override
            protected void onPostExecute(Long aLong) {
                presenter.getContentAddatTheEndArrayList(String.valueOf(aLong));
            }
        }.execute();
    }

    public  void calculateFindTheIndexOfElement(List<Integer> list) {

        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.indexOf(100);
                return (System.nanoTime() - temp);
            }

            @Override
            protected void onPostExecute(Long aLong) {
                presenter.getContentFindElementArrayList(String.valueOf(aLong));
            }
        }.execute();
    }

    public  void calculateRemoveFirstElementArrayList(List<Integer> list) {
        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.remove(1);
                return (System.nanoTime() - temp);
            }

            @Override
            protected void onPostExecute(Long aLong) {
                presenter.getContentOfDeleteFirstElementArrayList(String.valueOf(aLong));
            }
        }.execute();
    }

    public  void calculateRemoveMiddleElementArrayList(List<Integer> list) {
        new AsyncTask<Void, Void, Long>() {
        @Override
        protected Long doInBackground(Void... voids) {
            long temp = System.nanoTime();
            list.remove(list.size()/2);
            return (System.nanoTime() - temp);
        }

        @Override
        protected void onPostExecute(Long aLong) {
            presenter.getContentOfDeleteLastElementArrayList(String.valueOf(aLong));
        }
    }.execute();
    }

    public  void calculateRemoveLastElementatArrayList(List<Integer> list) {
        new AsyncTask<Void, Void, Long>() {
            @Override
            protected Long doInBackground(Void... voids) {
                long temp = System.nanoTime();
                list.remove(list.size()-1);
                return (System.nanoTime() - temp);
            }

            @Override
            protected void onPostExecute(Long aLong) {
                presenter.getContentOfDeleteLastElementArrayList(String.valueOf(aLong));
            }
        }.execute();
    }








}
