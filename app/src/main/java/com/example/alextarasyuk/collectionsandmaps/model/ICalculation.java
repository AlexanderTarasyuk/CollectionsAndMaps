package com.example.alextarasyuk.collectionsandmaps.model;

import java.util.Queue;
import java.util.concurrent.ExecutionException;

public interface ICalculation {
   Queue<Long> calculateList() throws ExecutionException, InterruptedException;
    Queue<Long> calculateMap() throws ExecutionException, InterruptedException;
}
