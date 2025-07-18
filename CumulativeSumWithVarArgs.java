import java.util.Scanner;

public class CumulativeSumWithVarArgs {

    public static int sumCumulative(int... numbers) {
        int totalSum = 0;

        System.out.println("\nCumulative sums per parameter:");
        for (int n : numbers) {
            int cumulative = 0;
            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }
            System.out.println(n + " = " + cumulative);
            totalSum += cumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();

        int[] inputNumbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextInt();
        }

        int total = sumCumulative(inputNumbers);

        System.out.println("\nTotal sum of cumulative values: " + total);

        scanner.close();
    }
}
