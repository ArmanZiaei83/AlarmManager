package com.example.alarmmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
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

        setTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, reminder.class );
                PendingIntent pendingInten = PendingIntent.getBroadcast(MainActivity.this, 0 , intent , 0);

                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                long currentSecond = System.currentTimeMillis();
                long tenSecond = 1000 * 10;

                alarmManager.set(AlarmManager.RTC_WAKEUP, currentSecond + tenSecond , pendingInten);
            }
        });
    }
}