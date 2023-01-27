import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int enteredValue = 0;

        System.out.print("How much money do you want to withdraw: ");
        enteredValue = input.nextInt();


        if (enteredValue > balance){
            System.out.println("Your balance is lower than requested!");
        }else {
            if (enteredValue % 100 != 0){
                System.out.println("You can withdraw only 100 SEK bills");
            }else {
                System.out.println("Your new balance is " + (balance - enteredValue));
            }
        }
    }
}