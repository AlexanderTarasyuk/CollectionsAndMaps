package com.example.alextarasyuk.collectionsandmaps.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.alextarasyuk.collectionsandmaps.BuildConfig;
import com.example.alextarasyuk.collectionsandmaps.R;
import com.example.alextarasyuk.collectionsandmaps.contract.Contract;
import com.example.alextarasyuk.collectionsandmaps.di.DaggerPresenterComponent;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity implements Contract.View {

    @BindView(R.id.btn_calculate)
    Button btn;
    @BindView(R.id.edt_text)
    EditText editText;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    @Inject
    Contract.ListPresenter listPresenter;
    @Inject
    Contract.MapPresenter mapPresenter;

    private ListFragment listFragment;
    private MapFragment mapFragment;

    private Unbinder unbinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        DaggerPresenterComponent.builder().build().inject(this);


//        listPresenter = ListPresenterImpl.getListPresenterSingleton();
        listPresenter.attachView(this);

//        mapPresenter = MapPresenterImpl.getMapPresenterSingleton();
        mapPresenter.attachView(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                listPresenter.initialzeList(Integer.valueOf(editText.getText().toString()));
                mapPresenter.initializeMap(Integer.valueOf(editText.getText().toString()));

            }
        }).start();

        listFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_collections);
        mapFragment = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_maps);


        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }


    @OnClick(R.id.btn_calculate)
    void calculateContenetOfTableafterButtonIsClicked(View view) {
        Timber.d("calculate content of table after button is clicked");


        if (listPresenter != null & (getSize() >= 1) & !TextUtils.isEmpty(editText.getText().toString())
                & Integer.valueOf(editText.getText().toString()) <= Integer.MAX_VALUE) {


            new Thread(new Runnable() {
                @Override
                public void run() {
                    listPresenter.initialzeList(Integer.valueOf(editText.getText().toString()));
                    mapPresenter.initializeMap(Integer.valueOf(editText.getText().toString()));
                }
            }).start();


            listPresenter.setTvInsertAtBeginningArrayList();
            listPresenter.setTvInsertAtMiddleArrayList();
            listPresenter.setTvInsertAtEndArrayList();
            listPresenter.setTvFindElementArrayList();
            listPresenter.setTvDeleteFirstArrayList();
            listPresenter.setTvDeleteFirstArrayList();
            listPresenter.setTvDeleteMiddle();
            listPresenter.setTvDeleteLastElementArrayList();

            listPresenter.setTvInsertAtBeginningLinkedList();
            listPresenter.setTvInsertAtMiddleLinkList();
            listPresenter.setTvInsertAtEndLinkList();
            listPresenter.setTvFindElementLinkList();
            listPresenter.setTvDeleteFirstLinkList();
            listPresenter.setTvDeleteMiddleLinkList();
            listPresenter.setTvDeleteLastLinkList();

            listPresenter.setTvInsertAtBeginningCopyOnWriteList();
            listPresenter.setTvInsertAtMiddleCopyOnWriteList();
            listPresenter.setTvInsertAtEndCopyOnWriteList();
            listPresenter.setTvFindElementCopyOnWriteList();
            listPresenter.setTvDeleteFirstCopyOnWriteList();
            listPresenter.setTvDeleteMiddleCopyOnWriteList();
            listPresenter.setTvDeleteLastCopyOnWriteList();

            mapPresenter.calculateAddNewElementToHashMap();
            mapPresenter.calculateFindElementInHashMapByKey();
            mapPresenter.calculateRemoveElementInHashMapByKey();

            mapPresenter.calculateAddNewElementToTreeMap();
            mapPresenter.calculateFindElementInTreeMapByKey();
            mapPresenter.calculateRemoveElementInTreeMapByKey();

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("EditTextValue", editText.getText().toString());
        getSupportFragmentManager().putFragment(outState, "ListFragment", listFragment);
        getSupportFragmentManager().putFragment(outState, "MapFragment", mapFragment);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            editText.setText(savedInstanceState.getString("EditTextValue"));
            listFragment = (ListFragment) getSupportFragmentManager().getFragment(savedInstanceState, "ListFragment");
            mapFragment = (MapFragment) getSupportFragmentManager().getFragment(savedInstanceState, "MapFragment");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (listPresenter != null) listPresenter.detachView();
        if (mapPresenter != null) mapPresenter.detachView();


        if (unbinder != null) unbinder.unbind();

    }


    public int getSize() {
        return Integer.valueOf(editText.getText().toString().trim());
    }


    @Override
    public void setTvInsertAtBeginningArrayList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtBeginningArrayList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtMiddleArrayList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtMiddleArrayList(valueOfCalculation);

    }

    @Override
    public void setTvInsertAtEndArrayList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtEndArrayList(valueOfCalculation);
    }

    @Override
    public void setTvFindElementArrayList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvFindElementArrayList(valueOfCalculation);

    }

    @Override
    public void setTvDeleteFirstArrayList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteFirstArrayList(valueOfCalculation);

    }

    @Override
    public void setTvDeleteMiddle(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteMiddleArrayList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastElementArrayList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteLastElementArrayList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtBeginningLinkedList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtBeginningLinkedList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtMiddleLinkList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtMiddleLinkList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtEndLinkList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtEndLinkList(valueOfCalculation);
    }

    @Override
    public void setTvFindElementLinkList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvFindElementLinkList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteFirstLinkList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteFirstLinkList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteMiddleLinkList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteMiddleLinkList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastLinkList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteLastLinkList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtBeginningCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null)
            listFragment.setTvInsertAtBeginningCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtMiddleCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null)
            listFragment.setTvInsertAtMiddleCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setTvInsertAtEndCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvInsertAtEndCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setTvFindElementCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvFindElementCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteFirstCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteFirstCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteMiddleCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteMiddleCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setTvDeleteLastCopyOnWriteList(String valueOfCalculation) {
        if (listFragment != null) listFragment.setTvDeleteLastCopyOnWriteList(valueOfCalculation);
    }

    @Override
    public void setAddNewInHashMap(String value) {
        mapFragment.setAddInHashMap(value);

    }

    @Override
    public void setSelectInHashMap(String value) {
        mapFragment.setSelectInHashMap(value);
    }

    @Override
    public void setRemoveInHashMap(String value) {
        mapFragment.setRemoveInHashMap(value
        );

    }

    @Override
    public void setAddNewInTreeMap(String value) {
        mapFragment.setAddInHTreeMap(value);

    }

    @Override
    public void setSelectInTreeMap(String value) {
        mapFragment.setSelectInTreeMap(value);

    }

    @Override
    public void setRemoveInTreeMap(String value) {
        mapFragment.setRemoveInTreeMap(value);

    }

    @Override
    public int loadSize() {
        return Integer.valueOf(editText.getText().toString().trim());
    }
}
