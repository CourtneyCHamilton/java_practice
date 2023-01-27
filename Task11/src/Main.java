import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dec = true;
        int choice;
        boolean acctExist = false;
        double balance;

        while (dec){
            System.out.print("""
                    - - - - Welcome to Bank of HKR - - - - \s
                    1) New account \s
                    2) View account \s
                    3) Deposit \s
                    4) Withdraw \s
                    5) Exit \s
                    - - - - - - - - - - - - - - - - - - - - - - - - - - \s
                    """);
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1){
                acctExist = true;
                balance = 0;
            }
        }
    }
}