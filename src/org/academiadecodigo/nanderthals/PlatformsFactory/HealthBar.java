package org.academiadecodigo.nanderthals.PlatformsFactory;


import org.academiadecodigo.nanderthals.GameOver;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class HealthBar {
    private final int maxHealth;
    private int currentHealth;
    private final Picture[] healthImages;
    private long lastHealthUpdateTime;
    private GameOver gameOver;
    public HealthBar() {
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.healthImages = new Picture[6];

        healthImages[0] = new Picture(80, 10, "/health0.png");
        healthImages[1] = new Picture(80, 10, "/health20.png");
        healthImages[2] = new Picture(80, 10, "/health40.png");
        healthImages[3] = new Picture(80, 10, "/health60.png");
        healthImages[4] = new Picture(80, 10, "/health80.png");
        healthImages[5] = new Picture(80, 10, "/health100.png");

        healthImages[calculateHealthImageIndex()].draw();

        this.lastHealthUpdateTime = System.currentTimeMillis();
        gameOver = new GameOver();
    }

    public void update() throws InterruptedException {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - lastHealthUpdateTime;

        long healthUpdateInterval = 2000; // Change to desired interval (in milliseconds)
        if (elapsedTime >= healthUpdateInterval) {
            decreaseHealthByPercentage(0.20); // Reduce health by 20%
            lastHealthUpdateTime = currentTime;
        }
    }

    public void decreaseHealthByPercentage(double percentage) throws InterruptedException {
        int amount = (int) (maxHealth * percentage);
        decreaseHealth(amount);
    }

    public void decreaseHealth(int amount) throws InterruptedException {
        currentHealth -= amount;
        System.out.println(currentHealth);
        if (currentHealth < 0) {
            currentHealth = 0;
        }

        updateHealthBarImage();

        if (currentHealth == 0) {
            gameOver();
        }
    }

    private void gameOver() throws InterruptedException {
        gameOver.gameOverScreen();
    }

    public void increaseHealthByPercentage(double percentage) {
        int amount = (int) (maxHealth * percentage);
        increaseHealth(amount);
    }

    public void increaseHealth(int amount) {
        currentHealth += amount;
        if (currentHealth > maxHealth) {
            currentHealth = maxHealth;
        }

        updateHealthBarImage();
    }

    public void updateHealthBarImage() {
        int healthIndex = calculateHealthImageIndex();

        healthImages[healthIndex].delete();
        healthImages[healthIndex].draw();
    }

    private int calculateHealthImageIndex() {
        double healthPercentage = (double) currentHealth / maxHealth;
        if (healthPercentage == 1.0) {
            return 5;
        } else if (healthPercentage >= 0.8) {
            return 4;
        } else if (healthPercentage >= 0.6) {
            return 3;
        } else if (healthPercentage >= 0.4) {
            return 2;
        } else if (healthPercentage >= 0.2) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getCurrentHealth()  {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public Picture[] getHealthImages() {
        return healthImages;
    }
}