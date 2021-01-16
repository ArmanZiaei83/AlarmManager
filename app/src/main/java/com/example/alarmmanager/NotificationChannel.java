package com.example.alarmmanager;

import android.app.Application;
import android.app.NotificationManager;
import android.os.Build;

public class NotificationChannel extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        createNotificationChannel();
    }
    public void createNotificationChannel () {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(
                    "alarmManagerNotification",
                    "alarmNotification",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
