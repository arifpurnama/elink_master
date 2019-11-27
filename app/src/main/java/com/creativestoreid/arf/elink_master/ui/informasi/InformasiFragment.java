package com.creativestoreid.arf.elink_master.ui.informasi;

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

public class InformasiFragment extends Fragment {

    private InformasiModel informasiModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        informasiModel =
                ViewModelProviders.of(this).get(InformasiModel.class);
        View root = inflater.inflate(R.layout.fragment_data_informasi, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        informasiModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}