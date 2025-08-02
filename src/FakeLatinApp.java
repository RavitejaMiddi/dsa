/**
 * @author Student Name - Student Number
 * This program translates English text to Fake Latin and vice versa.
 */

import java.util.Scanner;

// Class responsible for Fake Latin translation
class FakeLatinTranslator {
    /**
     * Translates English text to Fake Latin.
     * @param text The input English text
     * @return The translated Fake Latin text
     */
    public String toFakeLatin(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" "); // Split input into words

        for (String word : words) {
            if (word.length() > 0) {
                result.append(word.substring(1)) // Move first letter to end
                        .append(word.charAt(0))
                        .append("ay "); // Add "ay" suffix
            }
        }
        return result.toString().trim(); // Remove trailing space
    }

    /**
     * Translates Fake Latin text back to English.
     * @param text The Fake Latin input text
     * @return The translated English text
     */
    public String toEnglish(String text) {
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" "); // Split input into words

        for (String word : words) {
            if (word.length() > 2) { // Ensure valid Fake Latin format
                String core = word.substring(0, word.length() - 2); // Remove "ay"
                result.append(core.charAt(core.length() - 1)) // Move last letter to front
                        .append(core.substring(0, core.length() - 1))
                        .append(" ");
            }
        }
        return result.toString().trim(); // Remove trailing space
    }
}

// Main class to handle user interaction
public class FakeLatinApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        FakeLatinTranslator translator = new FakeLatinTranslator(); // Instantiate translator

        System.out.println("Enter text to translate (English to Fake Latin):");
        String input = scanner.nextLine(); // Read user input
        String fakeLatin = translator.toFakeLatin(input);
        System.out.println("Fake Latin: " + fakeLatin);

        System.out.println("\nEnter Fake Latin to translate back to English:");
        input = scanner.nextLine(); // Read user input
        String english = translator.toEnglish(input);
        System.out.println("English: " + english);

        scanner.close(); // Close scanner
    }
}
