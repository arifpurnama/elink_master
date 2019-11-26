package com.creativestoreid.arf.elink_master.ui.wilayah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WilayahViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WilayahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}