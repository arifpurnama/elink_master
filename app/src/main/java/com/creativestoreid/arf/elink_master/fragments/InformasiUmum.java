package com.creativestoreid.arf.elink_master.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.creativestoreid.arf.elink_master.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformasiUmum extends Fragment {


    public InformasiUmum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_informasi_umum, container, false);
    }

}
