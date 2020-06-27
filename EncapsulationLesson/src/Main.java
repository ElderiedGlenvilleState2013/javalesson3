import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        BankAccount myBank = new BankAccount(4111, 100);

        myBank.depoit(200);
        myBank.withdraw(-34);


        //lambda
       Answerable phone = ()-> {return "hello";};

       System.out.println(phone.answer());

        Predicate isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(2));

        Predicate isEvan = n->n %2 == 0;
        System.out.println(isEvan.test(2));


    }
}
