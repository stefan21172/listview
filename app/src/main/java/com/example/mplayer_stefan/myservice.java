package com.example.mplayer_stefan;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;



public class myservice extends Service  {
    MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {

            mediaPlayer = MediaPlayer.create(this, R.raw.roundabout);



    }



    @Override
    public void onDestroy() {
        mediaPlayer.release();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }
}
