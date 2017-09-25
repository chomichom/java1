import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double total = 0;

        System.out.println("1- Product 1, $2.98");
        System.out.println("2- Product 2, $4.50");
        System.out.println("3- Product 3, $9.98");
        System.out.println("4- Product 4, $4.49");
        System.out.println("5- Product 5, $6.87");

        System.out.printf("%nInput the product number of the product sold or Q to Quit: ");
        String input = keyboard.next().toLowerCase();

        while (!input.equals("q")) {
            int productNum;
            try {
                productNum = parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid product number. Quitting...");
                break;
            }

            if (productNum < 1 || productNum > 5) {
                System.out.println("Invalid product number. Quitting...");
                break;
            }

            System.out.printf("Input the quantity of the product sold: ");
            int productSold = keyboard.nextInt();

            switch (productNum) {
                case 1:
                    total += 2.98 * productSold;
                    break;
                case 2:
                    total += 4.50 * productSold;
                    break;
                case 3:
                    total += 9.98 * productSold;
                    break;
                case 4:
                    total += 4.49 * productSold;
                    break;
                case 5:
                    total += 6.87 * productSold;
                    break;
            }

            System.out.printf("%nInput the product number of the product sold or Q to Quit: ");
            input = keyboard.next().toLowerCase();
        }

        System.out.printf("%nThe total retail value of all products sold: $%.2f.%n", total);
    }
}