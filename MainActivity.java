package org.example.ayazkhan.alarmmanagerdemo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import org.example.ayazkhan.alarmmanagerdemo.recievers.SilentReciever;

public class MainActivity extends AppCompatActivity {



    AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
//
//        Intent intent = new Intent(this, SilentReciever.class);
//
//        intent.putExtra("SILENT",true);
//
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 10, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//
//        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ 5*1000, pendingIntent);
//
//        intent.putExtra("SILENT",false);
//        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(this, 20,intent , PendingIntent.FLAG_UPDATE_CURRENT);
//       alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ 10*1000, pendingIntent1);
//
    }
}
