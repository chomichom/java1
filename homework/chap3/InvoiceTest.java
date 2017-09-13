import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("12345", "Bread", 2, 56.09);
        Invoice invoice2 = new Invoice("1357", "Bagel", -7, 13.00);
        Invoice invoice3 = new Invoice("2468", "Bag", 10, -9.99);

        System.out.printf("Invoice: %s Description: %s Quantity: %d Price: $%.2f Total: $%.2f%n", invoice1.getNumber(),
                invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());

        System.out.printf("Invoice: %s Description: %s Quantity: %d Price: $%.2f Total: $%.2f%n", invoice2.getNumber(),
                invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());

        System.out.printf("Invoice: %s Description: %s Quantity: %d Price: $%.2f Total: $%.2f%n", invoice3.getNumber(),
                invoice3.getDescription(), invoice3.getQuantity(), invoice3.getPrice(), invoice3.getInvoiceAmount());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter invoice2 quantity: ");
        invoice2.setQuantity(input.nextInt());
        System.out.printf("Invoice: %s Description: %s Quantity: %d Price: $%.2f Total: $%.2f%n", invoice2.getNumber(),
                invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());
    }
}

