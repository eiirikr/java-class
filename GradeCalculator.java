import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = input.nextInt();

        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The student's grade is: " + grade);

        input.close();
    }
}