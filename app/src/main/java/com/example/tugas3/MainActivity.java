package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvOlshop;
    private ArrayList<OlshopModel> listOlshop = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvOlshop = findViewById(R.id.rv_list);
        rvOlshop.setHasFixedSize(true);
        listOlshop.addAll(OlshopData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvOlshop.setLayoutManager(new LinearLayoutManager(this));
        OlshopAdapter olshopAdapter = new OlshopAdapter(this);
        olshopAdapter.setOlshopModels(listOlshop);
        rvOlshop.setAdapter(olshopAdapter);
    }


}