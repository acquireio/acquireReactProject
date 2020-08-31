package com.example.myapplication;

import android.os.Bundle;

import com.acquireio.sdk.activities.AQR_BaseActivity;
import com.acquireio.AcquireApp;
import com.acquireio.sdk.enums.CallType;
import com.acquireio.callbacks.CallsCallback;

public class BaseActivity extends AQR_BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AcquireApp.setVisitorDetail("Sales Dept", "test@acquire.io", "", "2556");

//        AcquireApp.getInstance().startSupportChat(BaseActivity.this, CallType.VIDEO, new CallsCallback() {
//            @Override
//            public void onCallStart() {
//                finish();
//            }
//        });

        AcquireApp.getInstance().startThread("threadId", "Hi"); //startThread(String threadId, String message)
    }
}