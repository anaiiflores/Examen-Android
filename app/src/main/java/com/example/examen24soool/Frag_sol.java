package com.example.examen24soool;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Frag_sol extends Fragment {

    private ImageView sol;
    private View cielo;

    public Frag_sol() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag_sol, container, false);


        sol = view.findViewById(R.id.sol);
        cielo = view.findViewById(R.id.cielo);


        cielo.setOnClickListener(v -> startSunsetAnimation());
        return view;
    }

    private void startSunsetAnimation() {

        ObjectAnimator sunAnimator = ObjectAnimator.ofFloat(sol, "translationY", 0f, 800f);
        sunAnimator.setDuration(3000);


        ObjectAnimator skyAnimator = ObjectAnimator.ofArgb(cielo, "backgroundColor",
                getResources().getColor(R.color.skyBlue), getResources().getColor(R.color.black));
        skyAnimator.setDuration(1500);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(sunAnimator, skyAnimator);
        animatorSet.start();
    }
}
