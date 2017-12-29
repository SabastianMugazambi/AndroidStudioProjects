package com.example.sabastianmugazambi.upshello;

/**
 * Created by sabastianmugazambi on 12/29/17.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class runOnStartup extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);  //MyActivity can be anything which you want to start on bootup...
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }

}
