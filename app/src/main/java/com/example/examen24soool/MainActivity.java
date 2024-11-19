package com.example.examen24soool;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     //  Toolbar toolbar = findViewById(R.id.barra);
       // setSupportActionBar(toolbar);


       // getSupportActionBar().setTitle("Puesta de Sol");


        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            Fragment fragSol = new Frag_sol();
            transaction.replace(R.id.fragmentContainerView, fragSol);
            transaction.commit();
        }
    }




    }









