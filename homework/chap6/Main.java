import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("%nInput a number rounded to one decimal place: ");
        Float a = keyboard.nextFloat();
        System.out.printf("%nInput another number rounded to one decimal place: ");
        Float b = keyboard.nextFloat();
        System.out.printf("%nInput one more number rounded to one decimal place: ");
        Float c = keyboard.nextFloat();

        Float min = minimum3(a, b, c);

        System.out.printf("The minimum value is %.1f%n", min);
    }

    private static Float minimum3(Float a, Float b, Float c) {
        Float min = Math.min(a, b);
        return Math.min(min, c);
    }
}
