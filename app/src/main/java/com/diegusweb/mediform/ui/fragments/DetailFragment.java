package com.diegusweb.mediform.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.diegusweb.mediform.R;
import com.diegusweb.mediform.models.Constants;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


       // return inflater.inflate(R.layout.fragment_detail, container, false);

        View root = inflater.inflate(R.layout.fragment_detail, container, false);

        Constants.totleForm = "Ni modo";
        TextView article = (TextView) root.findViewById(R.id.textView1);
        article.setText("ssssssssssss");

        // setDummyContent();
        return root;
    }

}
