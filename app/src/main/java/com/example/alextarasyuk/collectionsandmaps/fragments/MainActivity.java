package com.example.alextarasyuk.collectionsandmaps.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alextarasyuk.collectionsandmaps.BuildConfig;
import com.example.alextarasyuk.collectionsandmaps.R;
import com.example.alextarasyuk.collectionsandmaps.presenter.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity  {

    private Presenter presenter;


    @BindView(R.id.btn_calculate)
    Button btn;
    @BindView(R.id.edt_text)
    EditText editText;
    private int size;

    ListFragment listFragment;
    MapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new Presenter();


        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        presenter.attachView(this);
    }

    @OnClick(R.id.btn_calculate)
    void calculate(View view) {
        presenter.calculateTableContentInPresenter(Integer.valueOf(editText.getText().toString()));

        editText.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettachView();

    }


    public int getSize() {
        return Integer.valueOf(editText.getText().toString().trim());
    }


}
