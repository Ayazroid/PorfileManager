package org.example.ayazkhan.alarmmanagerdemo.recievers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static android.content.Context.ALARM_SERVICE;

/**
 * Created by AyazKhan on 1/27/2017.
 */

public class MyDateChangeListner extends BroadcastReceiver {

AlarmManager  alarmManager;
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_DATE_CHANGED));
        Toast.makeText(context, "Date Changed", Toast.LENGTH_SHORT).show();

        alarmManager = (AlarmManager)context.getSystemService(ALARM_SERVICE);

        Intent minten = new Intent(context, SilentReciever.class);

        minten.putExtra("SILENT",true);

 PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 10, minten, PendingIntent.FLAG_UPDATE_CURRENT);

 alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ 5*1000, pendingIntent);

 minten.putExtra("SILENT",false);
PendingIntent pendingIntent1 = PendingIntent.getBroadcast(context, 20,minten , PendingIntent.FLAG_UPDATE_CURRENT);
alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ 10*1000, pendingIntent1);


    }
}
