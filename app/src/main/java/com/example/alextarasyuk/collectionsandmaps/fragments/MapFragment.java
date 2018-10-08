package com.example.alextarasyuk.collectionsandmaps.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alextarasyuk.collectionsandmaps.R;
import com.example.alextarasyuk.collectionsandmaps.model.MapCalculation;
import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.HashMap;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MapFragment extends Fragment  {


    @BindView(R.id.tv_add_new_hash_map)
    TextView tvAddHashMap;
    @BindView(R.id.tv_select_by_key_hash_map)
    TextView tvSelectHashMap;
    @BindView(R.id.tv_removing_hash_map)
    TextView tvRemovingHashMap;
    @BindView(R.id.tv_add_new_tree_map)
    TextView tvAddNewTreeMap;
    @BindView(R.id.tv_removing_tree_map)
    TextView tvRemovingTreeMap;
    @BindView(R.id.tv_select_by_key_tree_map)
    TextView tvSelectTreeMap;

    Queue<Long> queue;
    Presenter presenter;




    Unbinder unbinder;

    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_map, container, false);
        unbinder=ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();

    }

    public  void calculate(){

    }





}
