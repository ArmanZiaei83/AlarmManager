package com.example.alarmmanager;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;

public class MyNotification extends Application {

    private Context mContext;

    MyNotification(Context context) {
        mContext = context;
    }
    public void notif () {

        Intent intent = new Intent(mContext , MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(mContext , 0 , intent , 0);

        Notification notification = new NotificationCompat.Builder(mContext, "alarmManagerNotification")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("AlarmManager ...")
                .setContentText("Running ...")
                .setContentIntent(pendingIntent)
                .build();

        NotificationManager notificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1 , notification);

    }
}
