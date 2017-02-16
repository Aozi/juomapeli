package com.example.aozi.juomapeli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int counter =  0;
    private TextView myTe;
    private Button myBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTe = (TextView)findViewById(R.id.myText);

        myBtn = (Button)findViewById(R.id.button);
        myBtn.setOnClickListener(this);
    }

    @Override
    public void onClick (View V) {
        myTe.setText(Integer.toString(counter++));

    }


}
