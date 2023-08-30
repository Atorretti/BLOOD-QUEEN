package org.academiadecodigo.nanderthals;

import org.academiadecodigo.nanderthals.GameCharacters.HumanFactory;

public class HumanLifetimeThread implements Runnable {

    private HumanFactory humanFactory;
    private boolean running;

    public HumanLifetimeThread(HumanFactory humanFactory) {
        this.humanFactory = humanFactory;
    }

    @Override
    public void run() {
        running = true;

        // Initial delay before the first update
        try {
            Thread.sleep(18000); // Adjust the delay time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (running) {
            // Update the human factory to delete expired humans
            humanFactory.updateHumans(10000);

            try {
                Thread.sleep(12000); // Adjust the update interval time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void stop() {
        running = false;
    }
}
