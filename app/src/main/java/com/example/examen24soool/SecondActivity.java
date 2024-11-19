package com.example.examen24soool;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();


            transaction.replace(R.id.tamano, new Frag_tamano());


            transaction.replace(R.id.text, new Frag_texto());


            transaction.replace(R.id.colores, new Frag_colores());

            transaction.commit();
        }
    }

    public void updateText(String text, float size) {
        Frag_texto fragment = (Frag_texto) getSupportFragmentManager().findFragmentById(R.id.tamano);
        if (fragment != null) {
            fragment.updateText(text, size);
        }
    }

    public void updateTextColor(int red, int green, int blue) {
        Frag_texto fragment = (Frag_texto) getSupportFragmentManager().findFragmentById(R.id.tamano);
        if (fragment != null) {
            fragment.updateTextColor(red, green, blue);
        }
    }
}
