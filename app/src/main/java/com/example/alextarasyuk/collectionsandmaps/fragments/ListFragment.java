package com.example.alextarasyuk.collectionsandmaps.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alextarasyuk.collectionsandmaps.model.Calculation;
import com.example.alextarasyuk.collectionsandmaps.R;
import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements IViewInterface {


    @BindView(R.id.tv_insert_atBeginning_arList)
    TextView tvInsertAtBeginning;
    @BindView(R.id.tv_insert_atMiddle_arList)
    TextView tvInsertAtMiddle;
    @BindView(R.id.tv_insert_atEnd_arList)
    TextView tvInsertAtEnd;
    @BindView(R.id.tv_findElement_arList)
    TextView tvFindElement;
    @BindView(R.id.tv_al_delete_first)
    TextView tvDeleteFirst;
    @BindView(R.id.tv_delete_midddle_arList)
    TextView tvDeleteMiddle;
    @BindView(R.id.tv_delete_last_arList)
    TextView tvDeleteLast;

    @BindView(R.id.tv_insert_atBeginning_linkList)
    TextView tvInsertAtBeginningLinkedList;
    @BindView(R.id.tv_insert_atMiddle_linkList)
    TextView tvInsertAtMiddleLinkList;
    @BindView(R.id.tv_insert_atEnd_linkList)
    TextView tvInsertAtEndLinkList;
    @BindView(R.id.tv_findElement_linkList)
    TextView tvFindElementLinkList;
    @BindView(R.id.tv_delete_first_linkList)
    TextView tvDeleteFirstLinkList;
    @BindView(R.id.tv_delete_midddle_linkList)
    TextView tvDeleteMiddleLinkList;
    @BindView(R.id.tv_delete_last_linkList)
    TextView tvDeleteLastLinkList;

    @BindView(R.id.tv_insert_atBeginning_copy_on_write_arList)
    TextView tvInsertAtBeginningCopyOnWriteList;
    @BindView(R.id.tv_insert_atMiddle_copy_on_write_arList)
    TextView tvInsertAtMiddleCopyOnWriteList;
    @BindView(R.id.tv_insert_atEnd_copy_on_write_arList)
    TextView tvInsertAtEndCopyOnWriteList;
    @BindView(R.id.tv_findElement_copy_on_write_arList)
    TextView tvFindElementCopyOnWriteList;
    @BindView(R.id.tv_al_delete_first_copy_on_write_arList)
    TextView tvDeleteFirstCopyOnWriteList;
    @BindView(R.id.tv_delete_midddle_copy_on_write_arList)
    TextView tvDeleteMiddleCopyOnWriteList;
    @BindView(R.id.tv_delete_last_copy_on_write_arList)
    TextView tvDeleteLastCopyOnWriteList;

    private Presenter presenter;
    private Queue<Long> longQueue;


    Unbinder unbinder;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_collection, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        presenter = new Presenter();
        longQueue = presenter.getLongQueueList();
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    public void calculate() {

            tvInsertAtBeginning.setText(String.valueOf(longQueue.poll()));
            tvInsertAtMiddle.setText(String.valueOf(longQueue.poll()));
            tvInsertAtEnd.setText(String.valueOf(longQueue.poll()));
            tvFindElement.setText(String.valueOf(longQueue.poll()));
            tvDeleteFirst.setText(String.valueOf(longQueue.poll()));
            tvDeleteMiddle.setText(String.valueOf(longQueue.poll()));
            tvDeleteLast.setText(String.valueOf(longQueue.poll()));

            tvInsertAtBeginningLinkedList.setText(String.valueOf(longQueue.poll()));
            tvInsertAtMiddleLinkList.setText(String.valueOf(longQueue.poll()));
            tvInsertAtEndLinkList.setText(String.valueOf(longQueue.poll()));
            tvFindElementLinkList.setText(String.valueOf(longQueue.poll()));
            tvDeleteFirstLinkList.setText(String.valueOf(longQueue.poll()));
            tvDeleteMiddleLinkList.setText(String.valueOf(longQueue.poll()));
            tvDeleteLastLinkList.setText(String.valueOf(longQueue.poll()));

            tvInsertAtBeginningCopyOnWriteList.setText(String.valueOf(longQueue.poll()));
            tvInsertAtMiddleCopyOnWriteList.setText(String.valueOf(longQueue.poll()));
            tvInsertAtEndCopyOnWriteList.setText((String.valueOf(longQueue.poll())));
            tvFindElementCopyOnWriteList.setText(String.valueOf(longQueue.poll()));
            tvDeleteFirstCopyOnWriteList.setText(String.valueOf(longQueue.poll()));
            tvDeleteMiddleCopyOnWriteList.setText((String.valueOf(longQueue.poll())));
            tvDeleteLastCopyOnWriteList.setText(String.valueOf(longQueue.poll()));

    }


    @Override
    public int getSize() {
        return 0;
    }
}
