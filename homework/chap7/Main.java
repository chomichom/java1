public class Main {

    public static void main(String[] args) {

        int[] counts = new int[10]; // Values default to zero.
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
            System.out.println(counts[i]);
        }

        int[] bonus = new int[15]; // Values default to zero.
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] += 1;
            System.out.println(bonus[i]);
        }

        int[] bestScores = new int[] {30, 6, 100, 18, 73}; // Init values to zero.
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println(bestScores[i]);
        }
    }
}
