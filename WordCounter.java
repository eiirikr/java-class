import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        if (input.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}
