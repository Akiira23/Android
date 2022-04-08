package com.cursoandroid.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private SeekBar seekVolume;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarSeekBar();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bach);
    }

    private void inicializarSeekBar() {
        seekVolume = findViewById(R.id.seekVolume);

        //configurar audio manager
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //recuperar os valores de volume maximo e o volume atual
        int volumeMaximo = audioManager.getStreamMaxVolume((AudioManager.STREAM_MUSIC));
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        //cofigurar o volume maximo da seekbar
        seekVolume.setMax(volumeMaximo);

        //cofigurar o volume atual da seekbar
        seekVolume.setProgress(volumeAtual);

        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void executarSom(View view) {
        if (mediaPlayer != null)
            mediaPlayer.start();
    }

    public void pausarSom(View view) {
        if (mediaPlayer.isPlaying())
            mediaPlayer.pause();
    }

    public void pararSom(View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bach);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer.isPlaying())
            mediaPlayer.pause();
    }
}