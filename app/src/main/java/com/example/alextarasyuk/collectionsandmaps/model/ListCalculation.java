package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import timber.log.Timber;

public class ListCalculation {
    Presenter presenter;


    private List<Integer> list;

    public ListCalculation(List<Integer> list) {
        this.list = list;
    }


    public String calculateListInsertAtTheBeginning() throws ExecutionException, InterruptedException {
        InsertInList myAsynkTask = new InsertInList();
        myAsynkTask.execute(0);
        return String.valueOf(myAsynkTask.get());
    }

    public String calculateListInsertAtTheMiddle() throws ExecutionException, InterruptedException {
        InsertInList myAsynkTask2 = new InsertInList();
        myAsynkTask2.execute((list.size() / 2));
        return String.valueOf(myAsynkTask2.get());
    }

    public String calculateListInsertAtTheEnd() throws ExecutionException, InterruptedException {
        InsertInList myAsynkTask3 = new InsertInList();
        myAsynkTask3.execute(list.size() - 1);

        return String.valueOf(myAsynkTask3.get());
    }

    public long calculateFindTheIndexOfElement() throws ExecutionException, InterruptedException {
        FindElementInList myAsynkTask4 = new FindElementInList();
        myAsynkTask4.execute(new Random().nextInt(100_000));
        return myAsynkTask4.get();
    }

    public String calculateRemoveFirstElement() throws ExecutionException, InterruptedException {
        DeleteElementInList myAsynkTask5 = new DeleteElementInList();
        myAsynkTask5.execute(0);
        return String.valueOf(myAsynkTask5.get());
    }

    public long calculateRemoveMiddleElement() throws ExecutionException, InterruptedException {

        DeleteElementInList myAsynkTask6 = new DeleteElementInList();
        myAsynkTask6.execute(list.size() / 2);
        return myAsynkTask6.get();
    }

    public String calculateRemoveLastElement() throws ExecutionException, InterruptedException {

        DeleteElementInList myAsynkTask7 = new DeleteElementInList();
        myAsynkTask7.execute(list.size() - 1);
        return String.valueOf(myAsynkTask7.get());
    }


    public class InsertInList extends AsyncTask<Integer, Void, Long> {


        @Override
        protected Long doInBackground(Integer... voids) {

            long temp = System.nanoTime();
            list.add(0, 1000);
            return (System.nanoTime() - temp);
        }

        @Override
        protected void onPostExecute(Long aLong) {
            String temp=String.valueOf(aLong);
           if(list instanceof ArrayList) presenter.getResultArrayList(String.valueOf(aLong));
           if (list instanceof LinkedList) presenter.getResultLinkedList()

            }
        }
    }

    public class FindElementInList extends AsyncTask<Integer, Void, Long> {

        @Override
        protected Long doInBackground(Integer... voids) {

            Timber.d(list.getClass().getSimpleName() + "" + list.size() + " find " + voids[0]);

            long temp = System.nanoTime();
            list.indexOf(voids[0]);
            return (System.nanoTime() - temp);
        }

        @Override
        protected void onPostExecute(Long aLong) {
            presenter.getResult(String.valueOf(aLong));
        }
    }

    public class DeleteElementInList extends AsyncTask<Integer, Void, Long> {

        @Override
        protected Long doInBackground(Integer... voids) {

            Timber.d(list.getClass().getSimpleName() + "" + list.size() + " delete " + voids[0]);

            long temp = System.nanoTime();
            list.remove(voids[0]);
            return (System.nanoTime() - temp);
        }
    }
}
