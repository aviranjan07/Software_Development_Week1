import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Convert to lowercase (for uniform counting)
        input = input.toLowerCase();

        // Split sentence into words
        String[] words = input.split(" ");

        // HashMap to store word and count
        HashMap<String, Integer> map = new HashMap<>();

        // Counting logic
        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display result
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}