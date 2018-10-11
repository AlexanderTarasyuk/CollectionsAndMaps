package com.example.alextarasyuk.collectionsandmaps.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alextarasyuk.collectionsandmaps.R;

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
        tvFindElement.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteFirstArrayList(String valueOfCalculation) {
        tvDeleteFirst.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteMiddle(String valueOfCalculation) {
        tvDeleteMiddle.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastElementArrayList(String valueOfCalculation) {
        tvDeleteLast.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtBeginningLinkedList(String valueOfCalculation) {
        tvInsertAtBeginningLinkedList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtMiddleLinkList(String valueOfCalculation) {
        tvInsertAtMiddleLinkList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtEndLinkList(String valueOfCalculation) {
        tvInsertAtEndLinkList.setText(valueOfCalculation);
    }

    @Override
    public void setTvFindElementLinkList(String valueOfCalculation) {
        tvFindElementLinkList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteFirstLinkList(String valueOfCalculation) {
        tvDeleteFirstLinkList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteMiddleLinkList(String valueOfCalculation) {
        tvDeleteMiddleLinkList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastLinkList(String valueOfCalculation) {
        tvDeleteLastLinkList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtBeginningCopyOnWriteList(String valueOfCalculation) {
        tvInsertAtBeginningCopyOnWriteList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtMiddleCopyOnWriteList(String valueOfCalculation) {
        tvInsertAtMiddleCopyOnWriteList.setText(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtEndCopyOnWriteList(String valueOfCalculation) {
        tvInsertAtEndCopyOnWriteList.setText(valueOfCalculation);
    }

    @Override
    public void setTvFindElementCopyOnWriteList(String valueOfCalculation) {
        tvFindElementCopyOnWriteList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteFirstCopyOnWriteList(String valueOfCalculation) {
        tvDeleteFirstCopyOnWriteList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteMiddleCopyOnWriteList(String valueOfCalculation) {
        tvDeleteMiddleCopyOnWriteList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastCopyOnWriteList(String valueOfCalculation) {
        tvDeleteLastCopyOnWriteList.setText(valueOfCalculation);
    }

}
