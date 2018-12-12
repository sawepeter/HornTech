package com.example.devsawe.horntech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.example.devsawe.horntech.Adapters.HomeAdapter;
import com.example.devsawe.horntech.Model.HomeModel;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HomeModel> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //set the status bar background to transparent

        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //SET UP THE RECYCLERVIEW WITH ADAPTER
        recyclerView = findViewById(R.id.recyclerView);

        foodsList = new ArrayList<>();

        foodsList.add(new HomeModel(R.drawable.car6,"Driver",R.drawable.driver1, "Book" ));
        foodsList.add(new HomeModel(R.drawable.car2,"Driver",R.drawable.driver2, "Book" ));
        foodsList.add(new HomeModel(R.drawable.car4,"Driver",R.drawable.driver3, "Book" ));
        foodsList.add(new HomeModel(R.drawable.car3,"Driver",R.drawable.driver4, "Book" ));
        foodsList.add(new HomeModel(R.drawable.car7,"Driver",R.drawable.driver5, "Book" ));
        foodsList.add(new HomeModel(R.drawable.car8,"Driver",R.drawable.driver6, "Book" ));



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);

        HomeAdapter adapter = new HomeAdapter(this,foodsList);

        recyclerView.setAdapter(adapter);


    }
}
