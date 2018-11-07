package com.vaibhavdhunde.android.toasterlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vaibhavdhunde.android.toaster.Toaster;

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
        Toaster.showToast(this, getString(R.string.success_msg_welcome));
    }
}
