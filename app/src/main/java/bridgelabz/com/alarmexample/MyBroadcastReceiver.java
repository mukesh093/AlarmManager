package bridgelabz.com.alarmexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by bridgeit on 7/7/16.
 */
public class MyBroadcastReceiver extends BroadcastReceiver{
    MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.alarm   );
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
    }
}