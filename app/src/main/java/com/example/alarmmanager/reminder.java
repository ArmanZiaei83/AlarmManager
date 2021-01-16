package com.example.alarmmanager;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class reminder extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Notification notificationAlarmManager = new NotificationCompat.Builder(context, "alarmManagerNotification")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentText("10 second Reminder Worked ...")
                .setContentTitle("AlarmManager").build();

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(1 , notificationAlarmManager);
    }

}
