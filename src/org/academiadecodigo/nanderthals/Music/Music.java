package org.academiadecodigo.nanderthals.Music;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;
public class Music {


    private Clip clip;
    private Clip clip1;

    public void setMusic() {
        try {
            URL audioUrl = getClass().getResource("/Resources/zezeScream.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioUrl);

            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            // clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play(){
        clip.start();

    }
    public  void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }
    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
    public void setMusic1() {
        try {
            URL audioUrl = getClass().getResource("/Resources/suck.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioUrl);

            clip1= AudioSystem.getClip();
            clip1.open(audioInputStream);
            // clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void play1(){
        clip1.start();

    }
    public  void loop1(){
        clip1.loop(Clip.LOOP_CONTINUOUSLY);

    }
    public void stop1() {
        if (clip1 != null && clip.isRunning()) {
            clip1.stop();
            clip1.close();
        }
    }





}