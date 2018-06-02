package com.stg.great.verma.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String DATA = getIntent().getStringExtra("DATA");

        TextView txv = findViewById(R.id.textView_detail);
        txv.setText(DATA);
    }
}
