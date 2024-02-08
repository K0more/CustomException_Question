import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Integer count = 0;

        System.out.println("Enter the input paragraph");
        Scanner sc = new Scanner(System.in);
        String input_paragraph = sc.nextLine();

        System.out.println("Enter the word you want to find");
        String word_to_be_found = sc.nextLine();

        try {
            String[] words = input_paragraph.split("\\s+"); // Split the input paragraph into words
            for (String word : words) {
                if (word.contains(word_to_be_found)) {
                    count += 1;
                }
            }
            System.out.println("number of times word occurs: " + count);

            if (count == 0) {
                throw new CustomException("Word not found in the given paragraph");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}