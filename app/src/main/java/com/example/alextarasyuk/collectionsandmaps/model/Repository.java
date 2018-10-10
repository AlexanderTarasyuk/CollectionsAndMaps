package com.example.alextarasyuk.collectionsandmaps.model;

import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

public final class Repository {

    private Presenter presenter;
    private static Repository instatce;


    ListCalculation listCalculation;
    MapCalculation mapCalculation;

    private Repository() {
    }
    public static synchronized Repository createInstance(){

        if (instatce!=null){
            return instatce;
        }
        return new Repository();
    }








}

