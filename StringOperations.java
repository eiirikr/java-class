import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Length of the string: " + input.length());

        System.out.println("Uppercase: " + input.toUpperCase());

        System.out.println("Lowercase: " + input.toLowerCase());

        if (!input.isEmpty()) {
            System.out.println("First character: " + input.charAt(0));
        } else {
            System.out.println("First character: [String is empty]");
        }

        if (!input.isEmpty()) {
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        } else {
            System.out.println("Last character: [String is empty]");
        }

        if (input.length() >= 5) {
            System.out.println("Substring (2nd to 5th character): " + input.substring(1, 5));
        } else {
            System.out.println("Substring (2nd to 5th character): [String too short]");
        }

        scanner.close();
    }
}
