import java.util.Scanner;

public class StudentGrade {

    static char calculateGrade(double score) {
        if (score >= 75) {
            return 'A';
        } else if (score >= 65) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        if (score >= 0 && score <= 100) {
            char result = calculateGrade(score);

            System.out.println("--------------------");
            System.out.println("Score  : " + score);
            System.out.println("Grade  : " + result);
            System.out.println("--------------------");
        } else {
            System.out.println("Score must be between 0 and 100.");
        }

        scanner.close();
    }
}
