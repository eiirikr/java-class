import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a string with at least 10 characters: ");
            input = scanner.nextLine();
        } while (input.length() < 10);

        StringBuilder sb = new StringBuilder(input);

        System.out.println("1. Length: " + sb.length());

        System.out.println("2. First character: " + sb.charAt(0));

        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

        int indexOfA = sb.indexOf("a");
        System.out.println("4. Index of 'a': " + (indexOfA >= 0 ? indexOfA : "Not found"));

        if (sb.length() >= 6) {
            System.out.println("5. Substring (index 3 to 6): " + sb.substring(3, 6));
        } else {
            System.out.println("5. Substring (index 3 to 6): [String too short]");
        }

        sb.append("123");
        System.out.println("6. After append: " + sb);

        if (sb.length() >= 4) {
            sb.insert(4, "xyz");
            System.out.println("7. After insert at index 4: " + sb);
        } else {
            System.out.println("7. Insert skipped: String too short");
        }

        if (sb.length() >= 4) {
            sb.delete(2, 4);
            System.out.println("8. After delete (index 2 to 4): " + sb);
        } else {
            System.out.println("8. Delete skipped: String too short");
        }

        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("9. After deleteCharAt(8): " + sb);
        } else {
            System.out.println("9. deleteCharAt(8) skipped: String too short");
        }

        sb.reverse();
        System.out.println("10. Reversed string: " + sb);

        scanner.close();
    }
}
