package com.creativestoreid.arf.elink_master.ui.rumah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RumahViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RumahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}