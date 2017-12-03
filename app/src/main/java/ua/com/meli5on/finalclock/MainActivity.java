package ua.com.meli5on.finalclock;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class MainActivity extends AppCompatActivity {
    Button alarm_on, alarm_off;
    TimePicker timePicker;
    AlarmManager alarmManager;
    final Calendar calendar = Calendar.getInstance();
    Intent intent;
    PendingIntent pendingIntent;
    int hour;
    int minute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarm_off = findViewById(R.id.alarm_off);
        alarm_on = findViewById(R.id.alarm_on);
        timePicker = findViewById(R.id.timePicker);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        timePicker.setIs24HourView(true);
        intent = new Intent(getBaseContext(),QuestReceiver.class);

        alarm_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.set(Calendar.HOUR_OF_DAY, timePicker.getHour());
                calendar.set(Calendar.MINUTE, timePicker.getMinute());
                hour = timePicker.getHour();
                minute = timePicker.getMinute();
                String getHour = String.valueOf(hour);
                String getMinute = String.valueOf(minute);


                if (minute < 10){
                    Toast.makeText(getBaseContext(),"будильник сработает в " + getHour + ":0" + getMinute, Toast.LENGTH_SHORT).show();
                }else
                Toast.makeText(getBaseContext(),"будильник сработает в " + getHour + ":" + getMinute, Toast.LENGTH_SHORT).show();
                pendingIntent = PendingIntent.getBroadcast(getBaseContext(),0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                alarmManager.set(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntent);

            }
        });
        alarm_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"ответьте на 3 вопроса", Toast.LENGTH_SHORT).show();
            }
        });



    }


}
