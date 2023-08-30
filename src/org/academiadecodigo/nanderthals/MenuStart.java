package org.academiadecodigo.nanderthals;
import org.academiadecodigo.nanderthals.Music.MusicMenu;
import org.academiadecodigo.nanderthals.Music.Sound;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuStart implements KeyboardHandler {

    private boolean startGame;
    private boolean keyPressed;
    private Rectangle background;
    private Picture picture;

    private MusicMenu musicMenu;

    private Sound soundMenu;

    public MenuStart(){
        startGame=false;
        keyPressed=false;
        background= new Rectangle(10,10,100,390) ;
        background.setColor(Color.PINK);
        picture= new Picture(10,10,"/startingMenu2.png");
        musicMenu = new MusicMenu();
        soundMenu = new Sound();


        Keyboard keyboard= new Keyboard(this);
        spaceKey(keyboard);

    }

    public void show(){
        background.fill();
        picture.draw();
        musicMenu.setMusicMenu();
        musicMenu.play();
        musicMenu.loop();
        soundMenu.setSoundMenu();
        soundMenu.playSoundMenu();



    }
    public boolean startGame(){
        return startGame;
    }

    private void spaceKey(Keyboard keyboard){
        KeyboardEvent event= new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int keyCode = keyboardEvent.getKey();
        if(keyCode==KeyboardEvent.KEY_SPACE){
            startGame=true;
            keyPressed=true;
            musicMenu.stop();
            soundMenu.stopSoundMenu();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void waitForEnterKey(){
        while(!keyPressed){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}