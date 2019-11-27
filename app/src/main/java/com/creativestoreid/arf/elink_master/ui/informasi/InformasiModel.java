package com.creativestoreid.arf.elink_master.ui.informasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformasiModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InformasiModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}