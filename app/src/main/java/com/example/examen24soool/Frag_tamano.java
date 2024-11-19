package com.example.examen24soool;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag_tamano#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag_tamano extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private EditText editText;
    private SeekBar seekBar;
    private Button button;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frag_tamano() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag_tamano.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag_tamano newInstance(String param1, String param2) {
        Frag_tamano fragment = new Frag_tamano();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag_tamano, container, false);

        editText = view.findViewById(R.id.editText);
        seekBar = view.findViewById(R.id.seekBar);
        button = view.findViewById(R.id.changeTextButton);

        button.setOnClickListener(v -> {
            String text = editText.getText().toString();
            float textSize = seekBar.getProgress();
            ((SecondActivity) getActivity()).updateText(text, textSize);
        });

        return view;
    }
}
