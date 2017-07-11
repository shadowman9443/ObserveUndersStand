package com.example.shadwo.observeundersstand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

public class SecondActivity extends AppCompatActivity implements Observer {
    TextView addingValue,ovserverValue;
    double i=0;
    MontuApp montuApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        montuApp = (MontuApp) getApplication();
        montuApp.getObserver().addObserver(this);
        addingValue= (TextView) findViewById(R.id.addingValue);
        ovserverValue= (TextView) findViewById(R.id.ovserverValue);
        double k=  montuApp.getObserver().getValue();
        ovserverValue.setText(String.valueOf(k));

    }

    @Override
    public void update(Observable o, Object arg) {
        double k=  montuApp.getObserver().getValue();
        ovserverValue.setText(String.valueOf(k));
    }

    public void onAdd(View view) {

    }

    public void anotheractvity(View view) {
    }
}
