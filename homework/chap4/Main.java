import java.util.Scanner;

public class Main {

    /* *******************************

               Pseudocode!!

        maxNumber <- 0

        for cntr from 0 to 9:

            print "Enter Number: "
            currentNumber <- user input

            if first time (cntr == 0):
                maxNumber <- currentNumber
            else:
                if currentNumber > maxNumber:
                   maxNumber = currentNumber

        print "Max number = ", maxNumber

    */
    public static void main(String[] args) {
        int maxNumber = 0;
        Scanner input = new Scanner(System.in);

        for (int counter = 0; counter < 10; counter++) {
            System.out.printf("Enter Number %d: ", counter + 1);

            int currentNumber = input.nextInt();

            if (counter == 0) {
                maxNumber = currentNumber;
                continue;
            }

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        System.out.printf("Maximum number is %d.%n", maxNumber);
    }
}
