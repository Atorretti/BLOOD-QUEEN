package org.academiadecodigo.nanderthals;


import org.academiadecodigo.nanderthals.GameCharacters.HumanFactory;
import org.academiadecodigo.nanderthals.GameCharacters.Vampire;
import org.academiadecodigo.nanderthals.Music.Music;
import org.academiadecodigo.nanderthals.PlatformsFactory.*;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


import java.util.Timer;
import java.util.TimerTask;


/**
 * The game logic
 */
public class Game implements KeyboardHandler {
    private HumanFactory humanFactory;
    private Vampire vampire;
    private CollisionDetector collisionDetector;
    Ladder ladder;
    private Barrier barrier;
    private Keyboard keyboard;
    private int delay;
    private ScoreManager scoreManager;
    private HealthBar healthBar;



    public Game(int width, int height, int delay) {


        GameOver gameOver = new GameOver();
        Background background = new Background();
        Platforms platforms = new Platforms();
        ladder = new Ladder();
        ladder.loadLadders();
        this.barrier = new Barrier();
        barrier.loadBarriers();
        this.vampire = new Vampire();
        this.humanFactory = new HumanFactory();
        humanFactory.loadInitialHumans();
        this.collisionDetector = new CollisionDetector(vampire, ladder, barrier, humanFactory);
        keyboard = new Keyboard(this);
        addKeyboard();

        healthBar = new HealthBar();

        Timer timer = new Timer();
        int x = 900;
        int y = 30;

        scoreManager = new ScoreManager(x, y);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    healthBar.decreaseHealthByPercentage(0.20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("hp"+healthBar.getCurrentHealth());
            }
        }, 2000, 3000);

        init();
        this.delay = delay;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
            }
        }, 180000);

    }
    Music music = new Music();
    public void playMusic() {
        music.setMusic();
        music.play();
       // music.setMusic1();
      //  music.play1();
    }

    public void init() {

    }


    private void addKeyboard() {
        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(39);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(37);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(38);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(40);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        KeyboardEvent interact = new KeyboardEvent();
        interact.setKey(KeyboardEvent.KEY_E);
        interact.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(interact);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int keyPressed = keyboardEvent.getKey();

        if (keyPressed == 39) {

            if (!collisionDetector.checkTouchingBarrierRight(vampire)) {

                vampire.moveRight();
                return;
            }
            vampire.moveLeft();
            return;
        }


        if (keyPressed == 37) {
            if (!collisionDetector.checkTouchingBarrierLeft(vampire)) {

                vampire.moveLeft();
                return;
            }
            vampire.moveRight();
            return;
        }
        if ((keyPressed == 38)) {
            if (collisionDetector.checkTouchingUP(vampire)) {
                vampire.moveUp();
            }
        }

        if (keyPressed == 40) {
            if (collisionDetector.checkTouchingDown(vampire)) {
                vampire.moveDown();
            }
        }
        if (keyPressed == 69) {

            if (collisionDetector.checkVampireHumanCollision()) {
                healthBar.setCurrentHealth(healthBar.getCurrentHealth() + 25);
                if(healthBar.getCurrentHealth() > 100) {
                    healthBar.setCurrentHealth(100);
                }
                healthBar.updateHealthBarImage();
                humanFactory.spawnRandomHuman(healthBar);
                System.out.println("hp"+healthBar.getCurrentHealth());
               playMusic();


            }
        }

        }
    public HumanFactory getHumanFactory() {
        return humanFactory;
    }




    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }



}
