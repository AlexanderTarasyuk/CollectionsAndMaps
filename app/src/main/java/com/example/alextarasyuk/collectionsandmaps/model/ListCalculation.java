package com.example.alextarasyuk.collectionsandmaps.model;

import android.os.AsyncTask;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import timber.log.Timber;

public class ListCalculation implements ICalculation {

    private List<Integer> list;
    private Queue<Long> permlongQueue;

    public ListCalculation(List list) {
        this.list = list;
        permlongQueue = new PriorityQueue<>();
    }


    @Override
    public Queue<Long> calculateList() throws ExecutionException, InterruptedException {
        Queue<Long> longQueue = new PriorityQueue<>();
        longQueue.add(calculateArrrayListInsertAtTheBeginning());
        longQueue.add(calculateArrayListInsertAtTheMiddle());
        longQueue.add(calculateArrayListInsertAtTheEnd());
        longQueue.add(calculateFindTheIndexOfElement());
        longQueue.add(calculateRemoveFirstElement());
        longQueue.add(calculateRemoveMiddleElement());
        longQueue.add(calculateRemoveLastElement());
        permlongQueue.addAll(longQueue);
        return longQueue;

    }

    @Override
    public Queue<Long> calculateMap() {
        return null;

    }

    public long calculateArrrayListInsertAtTheBeginning() throws ExecutionException, InterruptedException {
        InsertInList myAsynkTask = new InsertInList();
        myAsynkTask.execute(0);
        return myAsynkTask.get();
    }

    public long calculateArrayListInsertAtTheMiddle() throws ExecutionException, InterruptedException {
        InsertInList myAsynkTask2 = new InsertInList();
        myAsynkTask2.execute((list.size() /2));
        return myAsynkTask2.get();
    }

    public long calculateArrayListInsertAtTheEnd() throws ExecutionException, InterruptedException {
        InsertInList myAsynkTask3 = new InsertInList();
        myAsynkTask3.execute(list.size() - 1);
        return myAsynkTask3.get();
    }

    public long calculateFindTheIndexOfElement() throws ExecutionException, InterruptedException {
        FindElementInList myAsynkTask4 = new FindElementInList();
        myAsynkTask4.execute(new Random().nextInt(100_000));
        return myAsynkTask4.get();
    }

    public long calculateRemoveFirstElement() throws ExecutionException, InterruptedException {
        DeleteElementInList myAsynkTask5 = new DeleteElementInList();
        myAsynkTask5.execute(0);
        return myAsynkTask5.get();
    }

    public long calculateRemoveMiddleElement() throws ExecutionException, InterruptedException {

        DeleteElementInList myAsynkTask6 = new DeleteElementInList();
        myAsynkTask6.execute(list.size() % 2);
        return myAsynkTask6.get();
    }


    public long calculateRemoveLastElement() throws ExecutionException, InterruptedException {

        DeleteElementInList myAsynkTask7 = new DeleteElementInList();
        myAsynkTask7.execute(list.size() - 1);
        return myAsynkTask7.get();
    }


    public class InsertInList extends AsyncTask<Integer, Void, Long> {


        @Override
        protected Long doInBackground(Integer... voids) {

            long temp = System.nanoTime();
            list.add(0, 1000);
            return (System.nanoTime() - temp);
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
