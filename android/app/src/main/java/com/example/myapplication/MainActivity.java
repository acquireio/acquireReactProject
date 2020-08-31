package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import com.acquireio.AcquireApp;
import com.acquireio.callbacks.OnSessionEvents;
import com.acquireio.sdk.enums.CallType;
import com.facebook.react.ReactActivity;
import android.content.Intent;

import java.util.List;

public class MainActivity extends ReactActivity implements OnSessionEvents {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "newreactProject";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AcquireApp.getInstance().setSessionListner(this);
    }

    @Override
    public void onSessionConnected() {
        Intent intent = new Intent(this,BaseActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSessionDisconnected(String s) {

    }

    @Override
    public void onAgentOnline() {

    }

    @Override
    public void onAgentOffline() {

    }

    @Override
    public void onAgentAvailable() {

    }

    @Override
    public void onCallConnected(CallType callType) {

    }

    @Override
    public void onCallDIsconnected(CallType callType) {

    }

    @Override
    public void callDisconnectWithReason(String s) {

    }

    @Override
    public void onTriggerEvent(String s) {

    }

    @Override
    public void onChatClosed() {

    }

    @Override
    public void onChatWidgetClose() {

    }

    @Override
    public void onTagChange(List<String> list) {

    }

    @Override
    public void noAgentAvailable() {

    }

    @Override
    public void onWaitDialogAppear() {

    }

    @Override
    public void onWaitDialogDisappear() {

    }
}