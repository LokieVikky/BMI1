package com.example.lokie.bmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class activity_idealWeight extends AppCompatActivity {

    @BindView(R.id.horiCards)
    RecyclerView horiCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideal_weight);
        ButterKnife.bind(this);

    }
}
