package org.example.ayazkhan.alarmmanagerdemo.recievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by AyazKhan on 1/23/2017.
 */

public class SilentReciever extends BroadcastReceiver {


AudioManager audioManager;

    @Override
    public void onReceive(Context context, Intent intent) {

        audioManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);

        Bundle b = intent.getExtras();
        boolean check = b.getBoolean("SILENT");

     if (check)
     {
        audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
         Toast.makeText(context, "called after 5 second", Toast.LENGTH_SHORT).show();
     }

     else
     {
         audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
         Toast.makeText(context, "called after 10 second", Toast.LENGTH_SHORT).show();
     }

    }
}
