import java.util.Random;
import java.util.Scanner;
import java.awt.*;


public class Main {

     public static void main(String[] args) {
        //System.out.println("hello sesson3");

         /*

         // conditional statement
        System.out.println("Enter an age ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age >= 0 && age <=5){
            System.out.println("baby");

        } else if (age >6 && age <= 11){
            System.out.println("kid");

        } else  if (age >=12 && age <= 17){
            System.out.println("Teen");

        } else if (age >= 18 ){
            System.out.println("adult");

        } else {
            System.out.println("invalid");
        }


        System.out.println("thank for using program");



        //Loops



         //while loop

         System.out.println("while loop");

         int x = 3;
         while(x > 0){
             System.out.println("current x: " + x);
             x = x - 1;

         }

         System.out.println("final x;" + x);

         System.out.println();



         //System.out.println(k(3));


         //do while loop

         System.out.println("do while loop");
         int y = 3;
         do {
             System.out.println("current y: " + y);
             y = y -1;

         } while(y > 0);
         System.out.println("final y: " + y);
         System.out.println();

         //for loop

         for(int i = 3; i > 0; i--){
             System.out.println("current i: " + i );


         }

         System.out.println();
*/

         //libraries

         double power = Math.pow(5,3);
         double sqar = Math.sqrt(power);

         Random rand = new Random();

         int randomNumber = rand.nextInt();

         int randNum = rand.nextInt(10);


         System.out.println(power + ", "+ sqar +","+ randNum + "," + randomNumber);


         //coin flip debugger

         Coin c = new Coin();

         System.out.println("Intial; " + c.getFaceUp());

         for(int i = 0; i<10; i++){
             c.flip();
             System.out.println("After Flip: " + c.getFaceUp());
         }


         //Debugging with IDE

         //breakpoint let you walk through an debug

    }


}
