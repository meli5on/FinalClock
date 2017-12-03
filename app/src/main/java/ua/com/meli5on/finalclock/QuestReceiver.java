package ua.com.meli5on.finalclock;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.AlarmClock;
import android.widget.Toast;

/**
 * Created by Andrew on 27.11.2017.
 */

public class QuestReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Intent in = new Intent(context, QuestActivity.class);
        in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(in);
    }




}
