package com.example.alextarasyuk.collectionsandmaps.fragments;


import android.os.Bundle;
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


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements IListFragment {


    @BindView(R.id.tv_insert_atBeginning_arList)
    TextView tvInsertAtBeginningArrayList;
    @BindView(R.id.tv_insert_atMiddle_arList)
    TextView tvInsertAtMiddleArrayList;
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
    private Unbinder unbinder;

    public static ListFragment newInstance() {
        return new ListFragment();
    }


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
        ButterKnife.bind(this, rootView);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


    @Override
    public void setTvInsertAtBeginningArrayList(String valueOfCalculation) {
        tvInsertAtBeginningArrayList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtMiddleArrayList(String valueOfCalculation) {
        tvInsertAtMiddleArrayList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtEndArrayList(String valueOfCalculation) {
        tvInsertAtEnd.setText(valueOfCalculation);
    }

    @Override
    public void setTvFindElementArrayList(String valueOfCalculation) {
        this.tvFindElement = tvFindElement;
    }

    @Override
    public void setTvDeleteFirstArrayList(String valueOfCalculation) {
        this.tvDeleteFirst = tvDeleteFirst;
    }

    @Override
    public void setTvDeleteMiddle(String valueOfCalculation) {
        this.tvDeleteMiddle = tvDeleteMiddle;
    }

    @Override
    public void setTvDeleteLastElementArrayList(String valueOfCalculation) {
        this.tvDeleteLast = tvDeleteLast;
    }

    @Override
    public void setTvInsertAtBeginningLinkedList(String valueOfCalculation) {
        this.tvInsertAtBeginningLinkedList = tvInsertAtBeginningLinkedList;
    }

    @Override
    public void setTvInsertAtMiddleLinkList(String valueOfCalculation) {
        this.tvInsertAtMiddleLinkList = tvInsertAtMiddleLinkList;
    }

    @Override
    public void setTvInsertAtEndLinkList(String valueOfCalculation) {
        this.tvInsertAtEndLinkList = tvInsertAtEndLinkList;
    }

    @Override
    public void setTvFindElementLinkList(String valueOfCalculation) {
        this.tvFindElementLinkList = tvFindElementLinkList;
    }

    @Override
    public void setTvDeleteFirstLinkList(String valueOfCalculation) {
        this.tvDeleteFirstLinkList = tvDeleteFirstLinkList;
    }

    @Override
    public void setTvDeleteMiddleLinkList(String valueOfCalculation) {
        this.tvDeleteMiddleLinkList = tvDeleteMiddleLinkList;
    }

    @Override
    public void setTvDeleteLastLinkList(String valueOfCalculation) {
        this.tvDeleteLastLinkList = tvDeleteLastLinkList;
    }

    @Override
    public void setTvInsertAtBeginningCopyOnWriteList(String valueOfCalculation) {
        this.tvInsertAtBeginningCopyOnWriteList = tvInsertAtBeginningCopyOnWriteList;
    }

    @Override
    public void setTvInsertAtMiddleCopyOnWriteList(String valueOfCalculation) {
        this.tvInsertAtMiddleCopyOnWriteList = tvInsertAtMiddleCopyOnWriteList;
    }

    @Override
    public void setTvInsertAtEndCopyOnWriteList(String valueOfCalculation) {
        this.tvInsertAtEndCopyOnWriteList = tvInsertAtEndCopyOnWriteList;
    }

    @Override
    public void setTvFindElementCopyOnWriteList(String valueOfCalculation) {
        this.tvFindElementCopyOnWriteList = tvFindElementCopyOnWriteList;
    }

    @Override
    public void setTvDeleteFirstCopyOnWriteList(String valueOfCalculation) {
        this.tvDeleteFirstCopyOnWriteList = tvDeleteFirstCopyOnWriteList;
    }

    @Override
    public void setTvDeleteMiddleCopyOnWriteList(String valueOfCalculation) {
        this.tvDeleteMiddleCopyOnWriteList = tvDeleteMiddleCopyOnWriteList;
    }

    @Override
    public void setTvDeleteLastCopyOnWriteList(String valueOfCalculation) {
        this.tvDeleteLastCopyOnWriteList = tvDeleteLastCopyOnWriteList;
    }
}
