import JavATM.Account;
import java.util.Scanner;

public class AccountTEST {
    public static void main(String args[])
    {
        Account account1 = new Account(50.00);
        Account account2 = new Account(7.53);

        //exibe saldo de cada objeto
        System.out.printf("Account balance is $%.2f\n", 
        account1.getBalance());
        System.out.printf("Account balance is $%.2f\n", 
        account2.getBalance());

        //Scann
        Scanner input = new Scanner(System.in);
        double depositAmount;//depósito do usuário

        System.out.print("Enter deposit for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);

        //exibe o saldo
        System.out.printf("Account balance is %.2f\n", 
        account1.getBalance());
        System.out.printf("Account balance is %.2f\n", 
        account2.getBalance());

        System.out.print("Enter deposit for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
        account2.credit(depositAmount);

        //exibe o saldo
        System.out.printf("Account balance is %.2f\n", 
        account1.getBalance());
        System.out.printf("Account balance is %.2f\n", 
        account2.getBalance());

    }
}
