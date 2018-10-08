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

public class MainActivity extends AppCompatActivity implements IViewInterface {

    Presenter presenter;


    @BindView(R.id.btn_calculate)
    Button btn;
    @BindView(R.id.edt_text)
    EditText editText;
    private int size;

    ListFragment listFragment;
    MapFragment mapFragment;


    public Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        presenter = Presenter.createPresenter();
        size = Integer.valueOf(editText.getText().toString().trim());

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

    }

    @OnClick(R.id.btn_calculate)
    void calculate(View view) {
        presenter.calculatePresenter();
        presenter.getSize();

        editText.setText("");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


    @Override
    public int getSize() {
        return Integer.valueOf(editText.getText().toString().trim());
    }
}
