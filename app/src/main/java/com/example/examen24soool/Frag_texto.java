package com.example.examen24soool;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag_texto#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag_texto extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView textView;

    public Frag_texto() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag_texto.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag_texto newInstance(String param1, String param2) {
        Frag_texto fragment = new Frag_texto();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_texto, container, false);
        textView = view.findViewById(R.id.textView);
        return view;
    }

    public void updateText(String text, float size) {
        textView.setText(text);
        textView.setTextSize(size);
    }

    public void updateTextColor(int red, int green, int blue) {
        textView.setTextColor(Color.rgb(red, green, blue));
    }
}
