import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        BankAccount myBank = new BankAccount(4111, 100);

        myBank.depoit(200);
        myBank.withdraw(-34);
    }
}
