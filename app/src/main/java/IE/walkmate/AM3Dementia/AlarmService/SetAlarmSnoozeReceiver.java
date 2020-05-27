package IE.walkmate.AM3Dementia.AlarmService;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Calendar;

import IE.walkmate.AM3Dementia.Class.Key;
import IE.walkmate.AM3Dementia.Class.MusicControl;

import static android.content.Context.NOTIFICATION_SERVICE;

public class SetAlarmSnoozeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmReceiver alarmReceiver = new AlarmReceiver();
        String action = intent.getAction();
        if (action.equals("Snooze")) {
            MusicControl.getInstance(context).stopMusic();
            int mReceiverID = Integer.parseInt(intent.getStringExtra(Key.EXTRA_REMINDER_ID));
            Log.e("SetAlarmSnoozeReceiver", mReceiverID + "");
            NotificationManager manager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
            manager.cancel(mReceiverID);

            //delete if exist
            alarmReceiver.cancelAlarm(context, -mReceiverID);

            Calendar now = Calendar.getInstance();
            now.add(Calendar.MINUTE, 10);
            alarmReceiver.setAlarm(context, now, mReceiverID);
        } else if (action.equals("Dismiss")) {
            MusicControl.getInstance(context).stopMusic();
        } else if (action.equals("Stop")) {
            try {
                MusicControl.getInstance(context).stopMusic();
                int mReceiverID = Integer.parseInt(intent.getStringExtra(Key.EXTRA_REMINDER_ID));
                //delete if exist
                alarmReceiver.cancelAlarm(context, -mReceiverID);
                Log.e("SetAlarmSnoozeReceiver", mReceiverID + "");
                NotificationManager manager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
                manager.cancel(mReceiverID);
            } catch (Exception ex) {
                Log.e("Error", ex.getMessage());
            }

        }
    }

}
