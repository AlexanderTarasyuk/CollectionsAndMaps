package com.example.alextarasyuk.collectionsandmaps;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Utils {

    private static volatile ExecutorService executorService;

    private Utils() {
    }

    public static int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static ExecutorService getExecutorService() {

        if (executorService == null) {
            synchronized (Utils.class) {
                executorService = Executors.newFixedThreadPool(getNumberOfCores());
            }
        }
        return executorService;
    }
}
