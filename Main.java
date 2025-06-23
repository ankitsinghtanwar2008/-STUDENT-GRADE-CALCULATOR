import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subject = sc.nextInt();

        int[] marks = new int[subject];
        int Marks = 0;

        for (int i = 0; i < subject; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            Marks += marks[i];
        }

        double average = (double) Marks / subject;

        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("-------Final Result Should Be:-------");
        System.out.println("Total Marks: " + Marks + "/" + (subject * 100));
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
