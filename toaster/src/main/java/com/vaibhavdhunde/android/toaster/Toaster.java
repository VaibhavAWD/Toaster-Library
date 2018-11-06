package com.vaibhavdhunde.android.toaster;

import android.content.Context;
import android.widget.Toast;

public final class Toaster {
    private Context mContext;

    public void initToaster(Context context) {
        mContext = context;
    }

    public void showToast(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
