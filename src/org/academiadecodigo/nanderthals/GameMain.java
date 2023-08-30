package org.academiadecodigo.nanderthals;
import org.academiadecodigo.nanderthals.GameCharacters.HumanFactory;
import org.academiadecodigo.nanderthals.Music.MusicStart;
import org.academiadecodigo.nanderthals.Music.Sound;
import org.academiadecodigo.nanderthals.Music.Sound;



public class GameMain {

    public static void main(String[] args) throws InterruptedException {

        MenuStart menuStart = new MenuStart();
        menuStart.show();
        menuStart.waitForEnterKey();
        if(menuStart.startGame()) {
            Game g = new Game(100, 50, 200);
            MusicStart music = new MusicStart();
            Sound sound1 = new Sound();


            // Play music
            music.setMusic();
            music.play();
            music.loop();

            // Play Sounds
            sound1.setSound1();
            sound1.playSound1();
            g.init();

            HumanFactory humanFactory = g.getHumanFactory();
            HumanLifetimeThread humanLifetimeThread = new HumanLifetimeThread(humanFactory);
            Thread lifetimeThread = new Thread(humanLifetimeThread);
            lifetimeThread.start();


        }
    }

}
