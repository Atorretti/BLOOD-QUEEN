package org.academiadecodigo.nanderthals.PlatformsFactory;


import org.academiadecodigo.nanderthals.GameCharacters.Vampire;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Ladder {
    public Picture[] ladders;


    public Ladder() {

        ladders = new Picture[20];
        //loadLadders();
    }


    public void loadLadders(){
        ladders[0] = new Picture(440,615,"/Ladder copy.png");
        ladders[1] = new Picture(267, 495, "/Ladder copy.png");
        ladders[2] = new Picture(267, 375,"/Ladder copy.png" );
        ladders[3] = new Picture(267, 255,"/Ladder copy.png" );
        ladders[4] = new Picture(620, 255,"/Ladder copy.png" );
        ladders[5] = new Picture(760, 255,"/Ladder copy.png" );
        ladders[6] = new Picture(1090, 255,"/Ladder copy.png" );
        ladders[7] = new Picture(690, 135,"/Ladder copy.png" );
        ladders[8] = new Picture(1090, 495,"/Ladder copy.png" );
        ladders[9] = new Picture(1090, 375,"/Ladder copy.png" );
        ladders[10] = new Picture(1090, 255,"/Ladder copy.png" );
        ladders[11] = new Picture(900, 615,"/Ladder copy.png" );

        ladders[0].draw();
        ladders[1].draw();
        ladders[2].draw();
        ladders[3].draw();
        ladders[4].draw();
        ladders[5].draw();
        ladders[6].draw();
        ladders[7].draw();
        ladders[8].draw();
        ladders[9].draw();
        ladders[10].draw();
        ladders[11].draw();
    }

    public int getCoordX(int i) {
        if (i >= 0 && i < ladders.length) {
            return ladders[i].getX();
        }
        return 0;
    }

    public int getCoordY(int i) {
        if (i >= 0 && i < ladders.length) {
            return ladders[i].getY();
        }
        return 0;
    }

}
