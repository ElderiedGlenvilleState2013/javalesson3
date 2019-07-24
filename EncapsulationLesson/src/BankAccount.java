import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class BankAccount {
    private int account_number;
    private int account_balance;


    public BankAccount(int inputAccountNum, int inputAccountBal){

        this.account_balance = inputAccountBal;
        this.account_number = inputAccountNum;


        System.out.println("you created account " + this.account_number + ".");


    }


    public void depoit(int addMoney){
        if (addMoney > 0 ){
            System.out.println("$" + addMoney + "" + "money add to account" + this.account_number + ".");

        } else {
            System.out.println("invail amount");
        }

    }


    public void withdraw(int removeMoney){
        if (removeMoney > this.account_balance){
            System.out.println("you cannont withdraw money ");
        } else {
            this.account_balance -=  removeMoney;
            System.out.println("you withdrew $" + this.account_number + ".");
        }
    }
}
