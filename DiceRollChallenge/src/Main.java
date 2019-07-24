import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Dice d = new Dice();

        System.out.println("Intial; " + d.getDiceFace());

        for(int i = 0; i<10; i++){
            d.roll();
            System.out.println("after roll: " + d.getDiceFace() );
            
        }


    }
}


