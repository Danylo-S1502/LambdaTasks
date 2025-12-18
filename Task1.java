import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        // Create array of 10 random numbers from 1 to 100 using stream
        int[] numbers = new Random()
                .ints(10, 1, 101)
                .toArray();

        // Print array using lambda
        System.out.println("Array elements:");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        // Find minimum using stream
        int min = Arrays.stream(numbers).min().orElseThrow();

        // Find maximum using stream
        int max = Arrays.stream(numbers).max().orElseThrow();

        System.out.println("\nMin value: " + min);
        System.out.println("Max value: " + max);
    }
}
