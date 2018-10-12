package com.example.alextarasyuk.collectionsandmaps.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alextarasyuk.collectionsandmaps.R;
import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.Queue;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MapFragment extends Fragment {


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
        unbinder = ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    public void setAddInHashMap(String value) {
        tvAddHashMap.setText(value);
    }

    public void setSelectInHashMap(String value) {
        tvSelectHashMap.setText(value);
    }

    public void setRemoveInHashMap(String value) {
        tvRemovingHashMap.setText(value);
    }

    public void setAddInHTreeMap(String value) {
        tvAddNewTreeMap.setText(value);
    }

    public void setSelectInTreeMap(String value) {
        tvSelectTreeMap.setText(value);
    }

    public void setRemoveInTreeMap(String value) {
        tvRemovingTreeMap.setText(value);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("22", tvAddHashMap.getText().toString());
        outState.putString("23", tvSelectHashMap.getText().toString());
        outState.putString("24", tvRemovingHashMap.getText().toString());

        outState.putString("25", tvAddNewTreeMap.getText().toString());
        outState.putString("26", tvSelectTreeMap.getText().toString());
        outState.putString("27", tvRemovingTreeMap.getText().toString());

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            tvAddHashMap.setText(savedInstanceState.getString("22"));
            tvSelectHashMap.setText(savedInstanceState.getString("23"));
            tvRemovingHashMap.setText(savedInstanceState.getString("24"));

            tvAddNewTreeMap.setText(savedInstanceState.getString("25"));
            tvSelectTreeMap.setText(savedInstanceState.getString("26"));
            tvRemovingTreeMap.setText(savedInstanceState.getString("27"));

        }
    }
}
