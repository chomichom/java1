import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        String oddOrEven = n % 2 == 0 ? "even" : "odd";

        System.out.printf("%d is %s.%n", n, oddOrEven); }
}
