package com.manuni.fragmentdatagettingfromactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DataShowingFragment extends Fragment {



    public DataShowingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data_showing, container, false);

        TextView resultTxt = view.findViewById(R.id.dataShow);
        Bundle getMessage = getArguments();

        if (getMessage != null) {
            String data = getMessage.getString("key");
            resultTxt.setText(data);
        }


        return view;
    }
}