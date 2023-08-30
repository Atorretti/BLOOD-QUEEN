package org.academiadecodigo.nanderthals.PlatformsFactory;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Platforms {

    public Platforms(){
        loadPlatforms();
    }

    public void loadPlatforms(){
        /**
         * PLATFORMS
         */
        Picture ground = new Picture(12,740,"/Floor3.png");
        Picture platform1 = new Picture(230,625,"/Platformthin.png");
        Picture platform2 = new Picture(30,505,"/Platformthin.png");
        Picture platform3 = new Picture(230,385,"/Platformlong.png");
        Picture platform4 = new Picture(30, 265,"/Platformthin.png");
        Picture platform5 = new Picture(478,145 ,"/Platformlong.png");
        Picture platform6 = new Picture(1058, 265,"/Platformthin.png");
        Picture platform7 = new Picture(730, 385,"/Platformlong.png");
        Picture platform8 = new Picture(1058, 505,"/Platformthin.png");
        Picture platform9 = new Picture(850, 625,"/Platformthin.png");
        Picture platform10 = new Picture(553, 265,"/Platformthin.png");

        Picture blood = new Picture(550, 390, "/bloody.png");
        Picture blood2 = new Picture(900, 390, "/bloody.png");
        Picture blood3 = new Picture(750, 150, "/bloody.png");
        Picture blood4 = new Picture(1220, 270, "/bloody.png");
        Picture blood5 = new Picture(1230, 510, "/bloody.png");
        Picture blood6 = new Picture(125, 270, "/bloody.png");
        Picture blood7 = new Picture(90, 510, "/bloody.png");
        Picture blood8 = new Picture(1000, 630, "/bloody.png");

        ground.draw();
        platform1.draw();
        platform2.draw();
        platform3.draw();
        platform4.draw();
        platform5.draw();
        platform6.draw();
        platform7.draw();
        platform8.draw();
        platform9.draw();
        platform10.draw();
        blood.draw();
        blood2.draw();
        blood3.draw();
        blood4.draw();
        blood5.draw();
        blood6.draw();
        blood7.draw();
        blood8.draw();
    }
}
