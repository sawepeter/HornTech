package com.example.devsawe.horntech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.devsawe.horntech.Model.ModelFood;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelFood> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.rv);

        foodsList = new ArrayList<>();

        foodsList.add(new ModelFood(R.drawable.driver2, name:"stanely Mbote", "Eldoret-Nakuru", "Book"));
        foodsList.add(new ModelFood(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));
        foodsList.add(new ModelFood(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));
        foodsList.add(new ModelFood(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);


    }
}
