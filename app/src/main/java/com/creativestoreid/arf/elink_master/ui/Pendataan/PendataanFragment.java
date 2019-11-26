package com.creativestoreid.arf.elink_master.ui.Pendataan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.creativestoreid.arf.elink_master.R;

public class PendataanFragment extends Fragment {

    private PendataanViewModel pendataanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pendataanViewModel =   ViewModelProviders.of(this).get(PendataanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_data_warga, container, false);

        return root;
    }
}