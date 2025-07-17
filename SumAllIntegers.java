import java.util.Scanner;

public class SumAllIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers to sum (type 'q' to quit):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
                }
            }
        }

        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}
