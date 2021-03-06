package com.team8.ionesmartalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.format.Time;
import android.util.Log;

/**
 * @author Team 8
 *
 *
 */
public class WakeupAlarmReceiver extends BroadcastReceiver {
    public WakeupAlarmReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("WakeupAlarmReceiver", "The wakeup alarm is called");

        // Set a new alarm through wakeup
        Intent newService = new Intent(context, WakeupAlarm.class);
        context.startService(newService);
    }
}
