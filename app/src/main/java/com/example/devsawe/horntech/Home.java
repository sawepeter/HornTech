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



        recyclerView = findViewById(R.id.rv);

        foodsList = new ArrayList<>();

        foodsList.add(new HomeModel(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));
        foodsList.add(new HomeModel(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));
        foodsList.add(new HomeModel(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));
        foodsList.add(new HomeModel(R.drawable.driver2, "stanely Mbote", "Eldoret-Nakuru", "Book"));


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLiLayoutManager = layoutManager;

        recyclerView.setLayoutManager(rvLiLayoutManager);

        HomeAdapter adapter = new HomeAdapter(this,foodsList);

        recyclerView.setAdapter(adapter);


    }
}
