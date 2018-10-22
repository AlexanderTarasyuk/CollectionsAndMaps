package com.example.alextarasyuk.collectionsandmaps.di;


import com.example.alextarasyuk.collectionsandmaps.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = PresenterModule.class)
@Singleton
public interface PresenterComponent {

    void provide(MainActivity mainActivity);

}
