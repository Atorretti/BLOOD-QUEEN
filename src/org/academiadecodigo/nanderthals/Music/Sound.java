package org.academiadecodigo.nanderthals.Music;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Sound {

    Clip clip3;
    Clip clip2;
    Clip clip4;
    Clip clip5;

    public void setSound1() {

        try {
            URL audioUrl2 = getClass().getResource("/Resources/soundScream.wav");
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(audioUrl2);
            clip3 = AudioSystem.getClip();
            clip3.open(audioInputStream2);

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void playSound1() {
        clip3.start();

    }
    public void loopSound1() {
        clip3.loop(Clip.LOOP_CONTINUOUSLY);

    }
    public void stopSound1() {
        if (clip3 != null && clip3.isRunning()) {
            clip3.stop();
            clip3.close();
        }
    }
    public void setSoundMenu() {

        try {
            URL audioUrl2 = getClass().getResource("/Resources/soundDeath.wav");
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(audioUrl2);
            clip2 = AudioSystem.getClip();
            clip2.open(audioInputStream2);

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    public void playSoundMenu() {
        clip2.start();

    }

    public void loopSoundMenu() {
        clip2.loop(Clip.LOOP_CONTINUOUSLY);

    }

    public void stopSoundMenu() {
        if (clip2 != null && clip2.isRunning()) {
            clip2.stop();
            clip2.close();
        }
    }
    public void setSoundStep() {

        try {
            URL audioUrl2 = getClass().getResource("/Resources/mudStep.wav");
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(audioUrl2);
            clip4 = AudioSystem.getClip();
            clip4.open(audioInputStream2);

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    public void playSoundStep() {
        clip4.start();

    }

    public void loopSoundStep() {
        clip4.loop(Clip.LOOP_CONTINUOUSLY);

    }

    public void stopSoundStep() {
        if (clip4 != null && clip3.isRunning()) {
            clip4.stop();
            clip4.close();
        }
    }

    public void setSoundLadder() {

        try {
            URL audioUrl2 = getClass().getResource("/Resources/ladder.wav");
            AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(audioUrl2);
            clip5 = AudioSystem.getClip();
            clip5.open(audioInputStream2);

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    public void playSoundLadder() {
        clip5.start();

    }

    public void loopSoundLadder() {
        clip5.loop(Clip.LOOP_CONTINUOUSLY);

    }

    public void stopSoundLadder() {
        if (clip5 != null && clip3.isRunning()) {
            clip5.stop();
            clip5.close();
        }
    }
}




