package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {
    public Background() {
        loadBackground();
    }

    public void loadBackground() {

        Picture background = new Picture(10, 10, "/Background.png");


        background.draw();


        /**
         * EXTRA FLAIR
         */

        Picture tree = new Picture(40, 600, "/TreeDead.png");
        Picture scareCrow = new Picture(1000, 705, "/ScareCrow.png");
        Picture eye = new Picture(1340, 30,"/Eye.png");
        Picture skull = new Picture(1090, 735, "/Skull.png");
        Picture lamp = new Picture(300,670,"/Lamp.png");
        Picture lamp2 = new Picture(600,670,"/Lamp.png");
        Picture lamp3 = new Picture(900, 670, "/Lamp.png");
        Picture lamp4 = new Picture(1200,670, "/Lamp.png");
        Picture bat = new Picture(200, 70, "/bat.png");
        Picture bat2 = new Picture(1100, 70, "/bat.png");
        Picture bat3 = new Picture(1250, 30, "/bat.png");
        Picture bat4 = new Picture(40, 30, "/bat.png");
        Picture bat5 = new Picture(450, 200, "/bat.png");
        Picture bat6 = new Picture(920, 200, "/bat.png");
        Picture pumpkin = new Picture(500, 105, "/pumpkin.png");
        Picture dracula = new Picture(585, 70,"/dracula.png" );
        Picture name = new Picture(535, 450,"/name3.png" );
        Picture grave = new Picture(650, 685,"/grave.png" );
        Picture cart = new Picture(1300, 225, "/Cart.png");

        tree.draw();
        scareCrow.draw();
        eye.draw();
        skull.draw();
        lamp.draw();
        lamp2.draw();
        lamp3.draw();
        lamp4.draw();
        bat.draw();
        bat2.draw();
        bat3.draw();
        bat4.draw();
        bat5.draw();
        bat6.draw();
        pumpkin.draw();

        dracula.draw();
        name.draw();
        grave.draw();
        cart.draw();

        tree.grow(30, 30);
        scareCrow.grow(10, 10);
        eye.grow(10, 10);
        skull.grow(0, 0);
        lamp.grow(30, 30);
        lamp2.grow(30, 30);
        lamp3.grow(30, 30);
        lamp4.grow(30, 30);
        cart.grow(20, 10);



        /**
         * PLATFORMS
         */
        Picture ground = new Picture(-90,40,"src/Resources/Ground.png");
        Picture ground2 = new Picture(650,40,"src/Resources/Ground.png");
        Picture platform1 = new Picture(0,550,"src/Resources/Platform1.png");
        Picture platform2 = new Picture(300,600,"src/Resources/Platform2.png");
        Picture platformL = new Picture(550,400,"src/Resources/PlatformL.png");
        Picture platformM = new Picture(1000,650,"src/Resources/PlatformM.png");
        Picture platform2M = new Picture(250,200,"src/Resources/Platform2M.png");
        Picture platform2L = new Picture(1000,150,"src/Resources/Platform2L.png");
        Picture platform2M2 = new Picture(1350,500,"src/Resources/Platform2M.png");

        ground.draw();
        ground2.draw();
        platform1.draw();
        platform2.draw();
        platformL.draw();
        platformM.draw();
        platform2M.draw();
        platform2L.draw();
        platform2M2.draw();

        ground.grow(-100, -100);
        ground2.grow(-100, -100);
        platform1.grow(10, 0);
        platform2.grow(10, 0);
        platformL.grow(30, 0);
        platformM.grow(30, 0);
        platform2M.grow(30, 0);
        platform2L.grow(30, 0);
        platform2M2.grow(30, 0);
    }
}
