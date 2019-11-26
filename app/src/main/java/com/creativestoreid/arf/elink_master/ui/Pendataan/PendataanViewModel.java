package com.creativestoreid.arf.elink_master.ui.Pendataan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PendataanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PendataanViewModel() {
        //mText = new MutableLiveData<>();
       // mText.setValue("INPUT DATA WARGA");
    }

    public LiveData<String> getText() {
        return mText;
    }
}