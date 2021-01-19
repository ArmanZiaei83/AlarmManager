package com.example.alarmmanager;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import static androidx.core.content.ContextCompat.getSystemService;


public class reminder extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        MyNotification myNotification = new MyNotification(context);
        myNotification.notif();
    }

}


