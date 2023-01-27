import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String address;
        String phone;
        String dec;
        boolean con = true;

        Scanner input = new Scanner(System.in);
        while (con){
            System.out.println("What is your name? ");
            name = input.next();
            System.out.println("What is your address? ");
            address = input.next();
            System.out.println("What is your phone number? ");
            phone = input.next();

            System.out.format("Your name: %s %n", name);
            System.out.format("Your address: %s %n", address);
            System.out.format("Your phone: %s %n", phone);

            System.out.println("Are you happy with your input? (yes/no) ");
            dec = input.next().toLowerCase();

            if (dec.equals("yes")){
                con = false;
        }
        }
    }
}