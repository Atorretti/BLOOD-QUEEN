package org.academiadecodigo.nanderthals;

import org.academiadecodigo.nanderthals.GameCharacters.*;
import org.academiadecodigo.nanderthals.PlatformsFactory.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;

public class CollisionDetector {
    private Vampire vampire;

    private Ladder ladder = new Ladder();
    private Barrier barrier = new Barrier();
    private HealthBar healthBar = new HealthBar();
    private ScoreManager scoreManager;
    private Background background;
    private HumanFactory humanFactory = new HumanFactory();

    public CollisionDetector(Vampire vampire, Ladder ladder, Barrier barrier,HumanFactory humanFactory) {
        this.vampire = vampire;
        this.ladder = ladder;
        this.barrier = barrier;
        this.humanFactory = humanFactory;
        Timer timer = new Timer();
        int x = 900;
        int y = 30;

        scoreManager = new ScoreManager(x, y);

    }

    public boolean checkTouchingUP(Vampire vampire) {
        for (int i = 0; i < ladder.ladders.length; i++) {
            if (((ladder.getCoordX(i) - 50) < vampire.getCoordX()) && (vampire.getCoordX() < (ladder.getCoordX(i) + 50))) {
                System.out.println(ladder.getCoordY(i));
                if (((ladder.getCoordY(i)) < vampire.getCoordY()) && (vampire.getCoordY() < (ladder.getCoordY(i) + 100))) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkTouchingDown(Vampire vampire) {
        for (int i = 0; i < ladder.ladders.length; i++) {
            if (((ladder.getCoordX(i) - 50) < vampire.getCoordX()) && (vampire.getCoordX() < (ladder.getCoordX(i) + 50))) {
                System.out.println(ladder.getCoordY(i));
                if (((ladder.getCoordY(i) - 50) < vampire.getCoordY()) && (vampire.getCoordY() < (ladder.getCoordY(i)))) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkTouchingBarrierRight(Vampire vampire) {
        for (int i = 0; i < barrier.barriers.length; i++) {
            if ((barrier.getCoordX(i)-20) == vampire.getCoordX()) {
                if ((vampire.getCoordY() >= barrier.getCoordY(i) && (vampire.getCoordY() <= (barrier.getCoordY(i)+ barrier.getHeight(i))))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkTouchingBarrierLeft(Vampire vampire) {
        for (int i = 0; i < barrier.barriers.length; i++) {
            if ((barrier.getCoordX(i)+20) == vampire.getCoordX()) {
                if ((vampire.getCoordY() >= barrier.getCoordY(i) && (vampire.getCoordY() <= (barrier.getCoordY(i)+ barrier.getHeight(i))))) {

                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVampireHumanCollision() {
        for (int i = 0; i < humanFactory.getHumanPic().length; i++) {
            int humanX = humanFactory.getCoordX(i);
            int humanY = humanFactory.getCoordY(i);

            if ((vampire.getCoordX() >= humanX - 50) && (vampire.getCoordX() <= humanX + 50)) {
                if ((vampire.getCoordY() >= humanY - 50) && (vampire.getCoordY() <= humanY + 50)) {

                    humanFactory.delete(i);
                    scoreManager.incrementScore(10);

                    return true;
                }
            }
        }

        return false;
    }



}




