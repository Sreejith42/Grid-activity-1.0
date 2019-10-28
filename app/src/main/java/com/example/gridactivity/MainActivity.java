package com.example.gridactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] numbers={"one","Two","Three","Four","Five",
    "Six","Seven","Eight","Nine","Ten"};

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buldRecycler();
    }

    private void buldRecycler() {
        recyclerView = findViewById(R.id.recylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        RecyclerDecoration recyclerDecoration = new RecyclerDecoration(this, R.dimen.item_offset);
        recyclerView.addItemDecoration(recyclerDecoration);
        recyclerAdapter = new RecyclerAdapter(numbers);
        recyclerView.setAdapter(recyclerAdapter);
    }


    public void CreateCard(){


    }
}
