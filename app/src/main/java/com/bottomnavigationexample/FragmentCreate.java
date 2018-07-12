package com.bottomnavigationexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import paginationadeptor.entella.com.bottomnavigationexample.R;


/**
 * Created by Kunal.Mahajan on 7/12/2018.
 */

public class FragmentCreate extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create, container, false);
        return view;
    }

}
