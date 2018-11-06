package com.vaibhavdhunde.android.toasterlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.btn_show_toast_msg)
    protected void showToastMessage() {
        // TODO: Show toast message using Toaster Library
    }
}
