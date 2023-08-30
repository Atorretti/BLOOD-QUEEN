package org.academiadecodigo.nanderthals.PlatformsFactory;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ScoreManager {
    private int score;
    private Picture scoreImage;
    private int x; // X coordinate for the score image
    private int y; // Y coordinate for the score image
    private Picture[] scoreImages; // Array to store the score images
    //private HumanFactory humanFactory;

    public ScoreManager(int x, int y) {
        this.score = 0;
        this.x = x;
        this.y = y;
        this.scoreImages = new Picture[16]; // Assuming there are 16 score images
        loadScoreImages();
        this.scoreImage = scoreImages[0]; // Load the initial score image
        this.scoreImage.draw();
    }

    private void loadScoreImages() {
        scoreImages[0] = new Picture(x, y, "/score_0.png");
        scoreImages[1] = new Picture(x, y, "/score_10.png");
        scoreImages[2] = new Picture(x, y, "/score_20.png");
        scoreImages[3] = new Picture(x, y, "/score_30.png");
        scoreImages[4] = new Picture(x, y, "/score_40.png");
        scoreImages[5] = new Picture(x, y, "/score_50.png");
        scoreImages[6] = new Picture(x, y, "/score_60.png");
        scoreImages[7] = new Picture(x, y, "/score_70.png");
        scoreImages[8] = new Picture(x, y, "/score_80.png");
        scoreImages[9] = new Picture(x, y, "/score_90.png");
        scoreImages[10] = new Picture(x, y, "/score_100.png");
        scoreImages[11] = new Picture(x, y, "/score_110.png");
        scoreImages[12] = new Picture(x, y, "/score_120.png");
        scoreImages[13] = new Picture(x, y, "/score_130.png");
        scoreImages[14] = new Picture(x, y, "/score_140.png");
        scoreImages[15] = new Picture(x, y, "/score_150.png");


    }

    public void incrementScore(int points) {
        score += points;
        updateScoreImage();
    }

    private void updateScoreImage() {
        scoreImage.delete();

        // Calculate the index of the score image based on the current score
        int imageIndex = score / 10;
        if (imageIndex >= scoreImages.length) {
            imageIndex = scoreImages.length - 1; // Prevent accessing out-of-bounds index
        }

        scoreImage = scoreImages[imageIndex];
        scoreImage.draw();
    }


}
