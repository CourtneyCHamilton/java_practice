public class Main {
    public static void main(String[] args) {
        // in python this is range (10, 1, -1)
        for (int i=10; i >= 1; i--){
            for (int y = 0; y <i; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}