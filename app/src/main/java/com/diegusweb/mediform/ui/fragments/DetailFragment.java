package com.diegusweb.mediform.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diegusweb.mediform.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public static final String TAG = "MainFragment";

    public DetailFragment() {
        // Required empty public constructor
    }

    public static DetailFragment newInstance(Bundle params){
        DetailFragment mf = new DetailFragment();
        mf.setArguments(params);
        return mf;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

}
