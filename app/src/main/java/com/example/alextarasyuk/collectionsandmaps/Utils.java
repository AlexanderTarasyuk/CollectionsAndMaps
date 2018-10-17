package com.example.alextarasyuk.collectionsandmaps;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Utils {

    private static ExecutorService executorService;

    private Utils() {
    }

    public static int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static ExecutorService getExecutorService() {
        synchronized (Utils.class) {

            if (executorService != null) {
                return executorService;
            } else {
                return Executors.newFixedThreadPool(getNumberOfCores());
            }
        }
    }
}