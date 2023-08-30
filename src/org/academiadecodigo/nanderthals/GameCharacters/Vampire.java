package org.academiadecodigo.nanderthals.GameCharacters;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Vampire  {

    private Keyboard keyboard;
    private Picture vampire1;

    public Vampire() {
        vampire1 = new Picture(200, 710, "/VampyGirl2.png");
        vampire1.grow(10, 10);
        vampire1.draw();

    }

    public int getCoordX() {
        return vampire1.getX();
    }

    public int getCoordY() {
        return vampire1.getY();
    }

    public void moveRight() {
        if (vampire1.getX() <= 1500) {
            vampire1.translate(10, 0);
            vampire1.load("/vampire_right.png");
        }
    }

    public void moveLeft() {
        if (vampire1.getX() >= 0) {
            vampire1.translate(-10, 0);
            vampire1.load("/vampire_left.png");
        }
    }

    public void moveUp() {
        vampire1.translate(0, -120);
    }

    public void moveDown() {
        vampire1.translate(0, 120);

    }

}
