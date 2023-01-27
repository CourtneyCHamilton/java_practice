import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int balance;
        int interest;
        int civicNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = input.nextLine();

        System.out.println("Enter your balance: ");
        balance = input.nextInt();

        System.out.println("Enter your Civic Number: ");
        civicNumber = input.nextInt();

        System.out.println("Enter the Interest: ");
        interest = input.nextInt();
        double new_balance = balance * (1 + interest * 0.01);

        System.out.println("You entered " + name);
        System.out.println("Your balance " + balance);
        System.out.printf("Your civic number: %s %n", civicNumber);
        System.out.format("%s, your current balance is %d", name, balance);
        System.out.print(" sek");
        System.out.println("Your interest rate: " + balance * (interest * 0.01));
        System.out.printf("Your balance after one year %.2f sek", new_balance);

        System.out.print("How much money do you want to deposit? (SEK)");
        balance += input.nextInt();

        System.out.println("Your new balance is " + balance);
    }
}