package org.academiadecodigo.nanderthals.PlatformsFactory;


import org.academiadecodigo.nanderthals.GameCharacters.Vampire;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Barrier {
    public Picture[] barriers;
    private Vampire vampire;

    public Barrier() {
        this.vampire = vampire;
        barriers = new Picture[20];
        //loadBarriers();
    }

    public void loadBarriers() {
       /* barriers[0] = new Picture(250, 550, "src/Resources/Lamp1.png");
        barriers[1] = new Picture(100, 680, "src/Resources/Lamp1.png");
        barriers[0].draw();
        barriers[1].draw();*/
        //barriers[0].grow(-10, 10);
        //barriers[1].grow(-10, 10);



        barriers[0] = new Picture(230, 550, "/Lamp1.png");
        barriers[1] = new Picture(500, 550, "/Lamp1.png");
        barriers[2] = new Picture(310, 430, "/Lamp1.png");
        barriers[3] = new Picture(30, 430, "/Lamp1.png");
        barriers[4] = new Picture(230, 310, "/Lamp1.png");
        barriers[5] = new Picture(650, 310, "/Lamp1.png");
        barriers[6] = new Picture(730, 310, "/Lamp1.png");
        barriers[7] = new Picture(1150, 310, "/Lamp1.png");
        barriers[8] = new Picture(30, 190, "/Lamp1.png");
        barriers[9] = new Picture(300, 190, "/Lamp1.png");
        barriers[10] = new Picture(550, 190, "/Lamp1.png");
        barriers[11] = new Picture(820, 190, "/Lamp1.png");
        barriers[12] = new Picture(1060, 190, "/Lamp1.png");
        barriers[13] = new Picture(1330, 190, "/Lamp1.png");
        barriers[14] = new Picture(480, 70, "/Lamp1.png");
        barriers[15] = new Picture(900, 70, "/Lamp1.png");
        barriers[16] = new Picture(1060, 430, "/Lamp1.png");
        barriers[17] = new Picture(1330, 430, "/Lamp1.png");
        barriers[18] = new Picture(850, 550, "/Lamp1.png");
        barriers[19] = new Picture(1120, 550, "/Lamp1.png");
        barriers[0].draw();
        barriers[1].draw();
        barriers[2].draw();
        barriers[3].draw();
        barriers[4].draw();
        barriers[5].draw();
        barriers[6].draw();
        barriers[7].draw();
        barriers[8].draw();
        barriers[9].draw();
        barriers[10].draw();
        barriers[11].draw();
        barriers[12].draw();
        barriers[13].draw();
        barriers[14].draw();
        barriers[15].draw();
        barriers[16].draw();
        barriers[17].draw();
        barriers[18].draw();
        barriers[19].draw();
    }

    public int getCoordX(int i) {
        if (i >= 0 && i < barriers.length) {
            return barriers[i].getX();
        }
        return 0;
    }

    public int getCoordY(int i) {
        if (i >= 0 && i < barriers.length) {
            return barriers[i].getY();
        }
        return 0;
    }
    public int getHeight(int i){
        if (i >= 0 && i < barriers.length) {
            return barriers[i].getHeight();
        }
        return 0;
    }
    public int getWidth(int i){
        if (i >= 0 && i < barriers.length) {
            return barriers[i].getWidth();
        }
        return 0;
    }

}
