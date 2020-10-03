package com.example.brvahrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.brvahrecyclerview.adapters.ProgramLagsAdapter;
import com.example.brvahrecyclerview.models.ProgramLags;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public RecyclerView rv;
    public ProgramLagsAdapter adapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<ProgramLags> listProgram = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        //Hide the action bar
        getSupportActionBar().hide();

        rv = findViewById(R.id.rvProgram);

        listProgram.add(new ProgramLags("JavaScript",
                "https://www.freepnglogos.com/uploads/javascript-png/javascript-vector-logo-yellow-png-transparent-javascript-vector-12.png"));
        listProgram.add(new ProgramLags("Python",
                "https://e7.pngegg.com/pngimages/621/411/png-clipart-computer-icons-python-anaconda-anaconda-angle-other-thumbnail.png"));
        listProgram.add(new ProgramLags("Java",
                "https://e7.pngegg.com/pngimages/785/145/png-clipart-java-development-kit-software-development-kit-computer-programming-computer-icons-programming-language-icon-text-logo-thumbnail.png"));
        adapter = new ProgramLagsAdapter(R.layout.item_program_list,listProgram);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(adapter);
        rv.setLayoutManager(layoutManager);
    }
}