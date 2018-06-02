package com.stg.great.verma.listviewpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit","Snake","Spider","Octopus","Pig","Sheep","Rabbit","Snake","Spider" };

    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary.",
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary."
    };

    Integer[] imageArray = {R.drawable.octopus,
            R.drawable.pig,
            R.drawable.sheep,
            R.drawable.rabbit,
            R.drawable.snake,
            R.drawable.spider,

            R.drawable.octopus,
            R.drawable.pig,
            R.drawable.sheep,
            R.drawable.rabbit,
            R.drawable.snake,
            R.drawable.spider};

    ListView mylistview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylistview = findViewById(R.id.list_view_dynamic);
        CustomListAdapter myListAdapter = new CustomListAdapter(
                this,imageArray,nameArray,infoArray);
        mylistview.setAdapter(myListAdapter);
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent IopenDetailAct = new Intent(getApplicationContext(),DetailActivity.class);
                IopenDetailAct.putExtra("DATA",nameArray[position]);
                startActivity(IopenDetailAct);
            }
        });
    }

}
