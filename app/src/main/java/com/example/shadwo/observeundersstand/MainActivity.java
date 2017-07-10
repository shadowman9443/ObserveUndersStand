package com.example.shadwo.observeundersstand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {
    TextView addingValue,ovserverValue;
    double i=0;
    MontuApp montuApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        montuApp = (MontuApp) getApplication();
        montuApp.getObserver().addObserver(this);
        addingValue= (TextView) findViewById(R.id.addingValue);
        ovserverValue= (TextView) findViewById(R.id.ovserverValue);
    }

    public void onAdd(View view) {
        i++;
        createView();
    }

    private void createView() {
        addingValue.setText(String.valueOf(i));

    }

    @Override
    public void update(Observable observable, Object o) {

      double k=  montuApp.getObserver().getValue();
        ovserverValue.setText(String.valueOf(k));
    }
}
