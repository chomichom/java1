public class Main {

    public static void main(String[] args) {
        int product = 1;

        for(int value = 1; value < 16; value += 2) {
            product *= value;
        }

        System.out.printf("Product of odd numbers 1 through 15 = %d.", product);
    }
}
