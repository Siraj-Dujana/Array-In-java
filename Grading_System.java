package arrays.in.java;
import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[numStudents];
        double[] eng = new double[numStudents];
        double[] sin = new double[numStudents];
        double[] com = new double[numStudents];
        double[] ma = new double[numStudents];
        double[] obtain = new double[numStudents];
        double[] per = new double[numStudents];
        double total = 400;
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter English Marks: ");
            eng[i] = scanner.nextDouble();

            System.out.print("Enter Sindhi Marks: ");
            sin[i] = scanner.nextDouble();

            System.out.print("Enter Computer Science Marks: ");
            com[i] = scanner.nextDouble();

            System.out.print("Enter Math Marks: ");
            ma[i] = scanner.nextDouble();

            obtain[i] = eng[i] + sin[i] + com[i] + ma[i];
            per[i] = (obtain[i] * 100) / total;

            if (per[i] >= 80 && per[i] <= 100) {
                grades[i] = 'A';
            } else if (per[i] >= 70 && per[i] <= 79) {
                grades[i] = 'B';
            } else if (per[i] >= 60 && per[i] <= 69) {
                grades[i] = 'C';
            } else if (per[i] < 60) {
                grades[i] = 'F';
            }
        }

        System.out.println("Name        English    Sindhi    Computer    Math    Obtain    Total    Percentage    GRADE");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(names[i]+"       "+ eng[i]+"       "+ sin[i]+"       "+ com[i]+"       "+ ma[i]+"     "+ obtain[i]+"     "+ total+"     "+ per[i]+"         "+ grades[i]);
   
        }
    }
}

