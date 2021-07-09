package com.example.callerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.PackageManager;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ArrayList<CallerAppModel> callerAppModels = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildList();
        setRecyclerView();


    }

    public void buildList(){
        for (int i=0;i<10;i++){
            CallerAppModel callerAppModel =new CallerAppModel("Rahul","987456231");
            callerAppModels.add(callerAppModel);
        }
    }

    public void setRecyclerView() {
        CallerAppAdapter callerAppAdapter=new CallerAppAdapter(callerAppModels,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(callerAppAdapter);
    }

    private void initViews(){
        recyclerView=findViewById(R.id.recycleView);
    }

}