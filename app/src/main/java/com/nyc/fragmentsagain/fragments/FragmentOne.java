package com.nyc.fragmentsagain.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nyc.fragmentsagain.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    private View rootView;
    private EditText editText;
    private TextView textView;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_one, container, false);
        Button button = (Button) rootView.findViewById(R.id.button);
        editText = (EditText) rootView.findViewById(R.id.edit_text);
        textView = (TextView) rootView.findViewById(R.id.text_view);
        Bundle bundle = getArguments();
        String textFromEdit = bundle.getString("one","");
        textView.setText(textFromEdit);
        return rootView;
    }

}
