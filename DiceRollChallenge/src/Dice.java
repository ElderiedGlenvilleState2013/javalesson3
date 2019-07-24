import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class Dice {

    public final static  int SIDEONE = 1;
    public final static int SIDETWO = 2;
    public final static int SIDETHREE = 3;
    public final static int SIDEFOUR = 4;
    public final static int SIDEFIVE = 5;
    public final static int SIDESIX = 6;


    private int sideUp;

    public Dice(){
        roll();
    }

    public void roll(){
        Random rand = new Random();
        sideUp = rand.nextInt(6);


    }


    public String getDiceFace(){
        if (sideUp == SIDEONE){
            return "ONE";

        } else if (sideUp == SIDETWO){
            return "TWO";

        } else if (sideUp == SIDETHREE){
            return "THIRD";

        } else if (sideUp == SIDEFOUR){
            return "FOUR";

        } else if (sideUp == SIDEFIVE){
            return "FIVE";

        }else if (sideUp == SIDESIX){
            return "SIX";
        } else {
            return "Invalid";
        }
    }


}


