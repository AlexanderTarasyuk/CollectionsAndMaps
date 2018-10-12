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
    TextView tvInsertAtEndArrayList;
    @BindView(R.id.tv_findElement_arList)
    TextView tvFindElementArrayList;
    @BindView(R.id.tv_al_delete_first)
    TextView tvDeleteFirstArrayList;
    @BindView(R.id.tv_delete_midddle_arList)
    TextView tvDeleteMiddleArrayList;
    @BindView(R.id.tv_delete_last_arList)
    TextView tvDeleteLastArrayList;

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
    Bundle bundle;


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
        tvInsertAtEndArrayList.setText(valueOfCalculation);
    }

    @Override
    public void setTvFindElementArrayList(String valueOfCalculation) {
        tvFindElementArrayList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteFirstArrayList(String valueOfCalculation) {
        tvDeleteFirstArrayList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteMiddleArrayList(String valueOfCalculation) {
        tvDeleteMiddleArrayList.setText(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastElementArrayList(String valueOfCalculation) {
        tvDeleteLastArrayList.setText(valueOfCalculation);
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

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("1", tvInsertAtBeginningArrayList.getText().toString());
        outState.putString("2", tvInsertAtMiddleArrayList.getText().toString());
        outState.putString("3", tvInsertAtEndArrayList.getText().toString());
        outState.putString("4", tvFindElementArrayList.getText().toString());
        outState.putString("5", tvDeleteFirstArrayList.getText().toString());
        outState.putString("6", tvDeleteMiddleArrayList.getText().toString());
        outState.putString("7", tvDeleteLastArrayList.getText().toString());

        outState.putString("8", tvInsertAtBeginningLinkedList.getText().toString());
        outState.putString("9", tvInsertAtMiddleLinkList.getText().toString());
        outState.putString("10", tvInsertAtEndLinkList.getText().toString());
        outState.putString("11", tvFindElementLinkList.getText().toString());
        outState.putString("12", tvDeleteFirstLinkList.getText().toString());
        outState.putString("13", tvDeleteMiddleLinkList.getText().toString());
        outState.putString("14", tvDeleteLastLinkList.getText().toString());

        outState.putString("15", tvInsertAtBeginningCopyOnWriteList.getText().toString());
        outState.putString("16", tvInsertAtMiddleCopyOnWriteList.getText().toString());
        outState.putString("17", tvInsertAtEndCopyOnWriteList.getText().toString());
        outState.putString("18", tvFindElementCopyOnWriteList.getText().toString());
        outState.putString("19", tvDeleteFirstCopyOnWriteList.getText().toString());
        outState.putString("20", tvDeleteMiddleCopyOnWriteList.getText().toString());
        outState.putString("21", tvDeleteLastCopyOnWriteList.getText().toString());

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            tvInsertAtBeginningArrayList.setText(savedInstanceState.getString("1"));
            tvInsertAtMiddleArrayList.setText(savedInstanceState.getString("2"));
            tvInsertAtEndArrayList.setText(savedInstanceState.getString("3"));
            tvFindElementArrayList.setText(savedInstanceState.getString("4"));
            tvDeleteFirstArrayList.setText(savedInstanceState.getString("5"));
            tvDeleteMiddleArrayList.setText(savedInstanceState.getString("6"));
            tvDeleteLastArrayList.setText(savedInstanceState.getString("7"));

            tvInsertAtBeginningLinkedList.setText(savedInstanceState.getString("8"));
            tvInsertAtMiddleLinkList.setText(savedInstanceState.getString("9"));
            tvInsertAtEndLinkList.setText(savedInstanceState.getString("10"));
            tvFindElementLinkList.setText(savedInstanceState.getString("11"));
            tvDeleteFirstLinkList.setText(savedInstanceState.getString("12"));
            tvDeleteMiddleLinkList.setText(savedInstanceState.getString("13"));
            tvDeleteLastLinkList.setText(savedInstanceState.getString("14"));

            tvInsertAtBeginningCopyOnWriteList.setText(savedInstanceState.getString("15"));
            tvInsertAtMiddleCopyOnWriteList.setText(savedInstanceState.getString("16"));
            tvInsertAtEndCopyOnWriteList.setText(savedInstanceState.getString("17"));
            tvFindElementCopyOnWriteList.setText(savedInstanceState.getString("18"));
            tvDeleteFirstCopyOnWriteList.setText(savedInstanceState.getString("19"));
            tvDeleteMiddleCopyOnWriteList.setText(savedInstanceState.getString("20"));
            tvDeleteLastCopyOnWriteList.setText(savedInstanceState.getString("21"));

        }

    }
}
