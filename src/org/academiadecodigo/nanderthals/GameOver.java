package org.academiadecodigo.nanderthals;

import org.academiadecodigo.nanderthals.Music.MusicStart;
import org.academiadecodigo.nanderthals.PlatformsFactory.HealthBar;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameOver implements KeyboardHandler {
    Picture gameOverPic;
    private boolean keyPressed;
    private boolean restartGame;

    public GameOver() {
        keyPressed = false;
        Keyboard keyboard = new Keyboard(this);
        spaceKey(keyboard);
        gameOverPic = new Picture(10, 10, "/GAME OVER.png");

    }
    public void gameOverScreen() throws InterruptedException {
        gameOverPic.draw();
        try {
        Thread.sleep(5000);
        System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private void spaceKey(Keyboard keyboard) {
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(event);
    }

    public boolean isRestartGame() {
        return restartGame;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int keyCode = keyboardEvent.getKey();
        if (keyCode == KeyboardEvent.KEY_SPACE) {

            keyPressed = true;
            if (keyPressed == true){

            }

            }
        }
        @Override
        public void keyReleased (KeyboardEvent keyboardEvent){

        }

    public void waitForEnterKey(){
        while(!keyPressed){
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
