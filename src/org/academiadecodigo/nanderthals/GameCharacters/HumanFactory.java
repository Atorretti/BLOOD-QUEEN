/*
package org.academiadecodigo.nanderthals.GameCharacters;


import org.academiadecodigo.nanderthals.CollisionDetector;
import org.academiadecodigo.nanderthals.Music.Music;
import org.academiadecodigo.nanderthals.PlatformsFactory.ScoreManager;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class HumanFactory {


    public Picture[] humanPic;
    private ScoreManager scoreManager;
    // private CollisionDetector collisionDetector;
    //private Character character;
    private Music music1;

    public HumanFactory() {

        humanPic = new Picture[18];
        //this.humanPic = new Picture(getX, getY, "src/Resources/human.png");
        //humanPic = new Picture(50, 50, "src/Resources/human.png");
        //humanPic.draw();
        //newHuman();
        //this.humanPic=new Picture(30,210,"src/Resources/human.png");
        //this.humanPic.draw();

    }

 //need to make humans spawns




    public void newHuman() {
                humanPic[0] = new Picture(100, 450, "/human.png");
                humanPic[0].draw();
                humanPic[1] = new Picture(510, 90, "/guga.png");
                humanPic[1].draw();
                humanPic[2] = new Picture(780, 210, "/human.png");
                humanPic[2].draw();
                humanPic[3] = new Picture(1200, 210, "/nozk.png");
                humanPic[3].draw();
                humanPic[4] = new Picture(1280, 450, "/human.png");
                humanPic[4].draw();
                humanPic[5] = new Picture(1000, 570, "/human.png");
                humanPic[5].draw();
                humanPic[6] = new Picture(300, 570, "/guga.png");
                humanPic[6].draw();
                humanPic[7] = new Picture(150, 210, "/human.png");
                humanPic[7].draw();
                humanPic[8] = new Picture(1050, 690, "/nozk.png");
                humanPic[8].draw();
    }

    public int getCoordX(int i) {
        if (i >= 0 && i < humanPic.length) {
            return humanPic[i].getX();
        }
        return 0;
    }


    public int getCoordY(int i) {
        if (i >= 0 && i < humanPic.length) {
             return humanPic[i].getY();
        }
        return 0;
    }
    Music music = new Music();
    public void delete(int i) {
        if (i >= 0 && i < humanPic.length) {
            System.out.println(humanPic[0]);
            humanPic[i].translate(-10000,0);
            humanPic[i].delete();
            music.setMusic();
            music.play();
            music.setMusic1();
            music.play1();

        }
    }
    public void reloadSpaws(int i){

        newHuman();
    }
}



*/
/*

package org.academiadecodigo.nanderthals.GameCharacters;

import org.academiadecodigo.nanderthals.Music.Music;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class HumanFactory {

    public Picture[] humanPic;
    private int[][] humanPositions = {
            {100, 450}, {510, 90}, {780, 210}, {1200, 210},
            {1280, 450}, {1000, 570}, {300, 570}, {150, 210},
            {1050, 690}
    };

    public HumanFactory() {
        humanPic = new Picture[humanPositions.length];
        loadHumans();
    }

    public void loadHumans() {
        for (int i = 0; i < humanPositions.length; i++) {
            int x = humanPositions[i][0];
            int y = humanPositions[i][1];
            humanPic[i] = new Picture(x, y, "/nozk.png");
            humanPic[i].draw();
        }
    }

    Music music = new Music();

    public void delete1(int i) {

        if (i >= 0 && i < humanPic.length) {
            System.out.println(humanPic[i]);
            humanPic[i].translate(-10000, 0);
            humanPic[i].delete();
            humanPic[1].delete();
            music.setMusic();
            music.play();
            music.setMusic1();
            music.play1();

        }
    }

    public void reloadSpawns() {
        for (Picture pic : humanPic) {
            pic.delete();
        }
        loadHumans();
    }

    public int getCoordX(int i) {
        if (i >= 0 && i < humanPic.length) {
            return humanPic[i].getX();
        }
        return 0;
    }

    public int getCoordY(int i) {
        if (i >= 0 && i < humanPic.length) {
            return humanPic[i].getY();
        }
        return 0;
    }

    // ... other methods and properties
}

*/
package org.academiadecodigo.nanderthals.GameCharacters;

import org.academiadecodigo.nanderthals.Music.Music;
import org.academiadecodigo.nanderthals.PlatformsFactory.HealthBar;
import org.academiadecodigo.simplegraphics.pictures.Picture;


import java.util.Random;

public class HumanFactory {




    private Picture[] humanPic;
    private int[][] humanPositions = {
            {100, 450}, {510, 90}, {780, 210}, {1200, 210},
            {1280, 450}, {1000, 570}, {300, 570}, {150, 210},
            {1050, 690},  {150, 450}, {560, 90}, {730, 210}, {1250, 210},
            {1230, 450}, {950, 570}, {350, 570}, {200, 210},

            {1100, 690},  {100, 450}, {510, 90}, {780, 210}, {1200, 210},
            {1280, 450}, {1000, 570}, {300, 570}, {150, 210},
            {1050, 690},  {150, 450}, {560, 90}, {730, 210}, {1250, 210},
            {1230, 450}, {950, 570}, {350, 570}, {200, 210},

            {1100, 690} , {100, 450}, {510, 90}, {780, 210}, {1200, 210},
            {1280, 450}, {1000, 570}, {300, 570}, {150, 210},
            {1050, 690},  {150, 450}, {560, 90}, {730, 210}, {1250, 210},
            {1230, 450}, {950, 570}, {350, 570}, {200, 210},

            {1100, 690} , {100, 450}, {510, 90}, {780, 210}, {1200, 210},
            {1280, 450}, {1000, 570}, {300, 570}, {150, 210},
            {1050, 690},  {150, 450}, {560, 90}, {730, 210}, {1250, 210},
            {1230, 450}, {950, 570}, {350, 570}, {200, 210},




    };
    private Music music;

    private long[] humanSpawnTime = new long[humanPositions.length];
    private long[] humanLifespan = new long[humanPositions.length];
    private long lastUpdateTime = System.currentTimeMillis();


    public Picture[] getHumanPic() {
        return humanPic;
    }
    public HumanFactory() {
        humanPic = new Picture[humanPositions.length];
        music = new Music();
    }

    public void loadInitialHumans() {
        for (int i = 0; i < humanPositions.length-62; i++) {
            int x = humanPositions[i][0];
            int y = humanPositions[i][1];
            humanPic[i] = new Picture(x, y, getRandomHumanImage());
            humanPic[i].draw();
            humanLifespan[i] = 10000; // Set the lifespan to 10 seconds
        }
    }


public void spawnRandomHuman(HealthBar healthbar) {
    if (healthbar.getCurrentHealth() <= 0) {
        return;
    }

    Random random = new Random();
    int randomIndex = random.nextInt(humanPositions.length);

    int attempts = 0;
    while (humanPic[randomIndex] != null && attempts < humanPositions.length) {
        randomIndex = random.nextInt(humanPositions.length);
        attempts++;
    }

    if (humanPic[randomIndex] != null) {
        // No available position found
        return;
    }

    int x = humanPositions[randomIndex][0];
    int y = humanPositions[randomIndex][1];
    humanPic[randomIndex] = new Picture(x, y, getRandomHumanImage());
    humanPic[randomIndex].draw();

    humanSpawnTime[randomIndex] = System.currentTimeMillis();
    humanLifespan[randomIndex] = 5000;
}


    private String getRandomHumanImage() {
        String[] possibleImages = {"/human.png", "/nozk.png", "/guga.png"};
        Random random = new Random();
        return possibleImages[random.nextInt(possibleImages.length)];
    }

    public int getCoordX(int i) {
        if (i >= 0 && i < humanPic.length && humanPic[i] != null) {
            return humanPic[i].getX();
        }
        return 0;
    }


    public int getCoordY(int i) {
        if (i >= 0 && i < humanPic.length && humanPic[i] != null) {
            return humanPic[i].getY();
        }
        return 0;
    }


    public void delete(int i) {
        if (i >= 0 && i < humanPic.length) {
            System.out.println(humanPic[i]);
           // playMusic();

            humanPic[i].translate(-10000,0);
            humanPic[i].delete();
            humanPic[i] = null;

            System.out.println(humanPic[i]);
        }
    }

    public void reloadSpawns() {
        loadInitialHumans();
    }

    private void playMusic() {
        music.setMusic();
        music.play();
        music.setMusic1();
        music.play1();
    }
    public void updateHumans(long elapsedTime) {
        long currentTime = System.currentTimeMillis();

        for (int i = 0; i < humanPic.length; i++) {
            if (humanPic[i] != null) {
                long timeSinceSpawn = currentTime - humanSpawnTime[i];
                if (timeSinceSpawn >= humanLifespan[i]) {
                    delete(i);

                }
            }
        }
    }


}
