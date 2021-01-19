package com.example.alarmmanager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button setTimeButton = (Button) findViewById(R.id.setTime);

            Intent intent = new Intent(MainActivity.this, reminder.class );
                PendingIntent pendingInten = PendingIntent.getBroadcast(MainActivity.this, 0 , intent , 0);

                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                //create a Calendar Instance Using the following code :
        Calendar calendar = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY , 12);
            calendar.set(Calendar.MINUTE , 33);
            calendar.set(Calendar.SECOND , 0);
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP , calendar.getTimeInMillis() , AlarmManager.INTERVAL_DAY , pendingInten);
        }

    }
}