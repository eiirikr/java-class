package Task121;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(9, 21, 1984);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        System.out.println("Year " + date1.getYear() + " is a leap year? " + isLeap(date1.getYear()));
        System.out.println("Year " + date2.getYear() + " is a leap year? " + isLeap(date2.getYear()));

        System.out.println("\nLeap years from 1980 to 2023:");
        DateTask.leapYears();
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
