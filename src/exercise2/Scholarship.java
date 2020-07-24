package exercise2;

import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double income = Float.parseFloat(scanner.nextLine());
        float grade = Float.parseFloat(scanner.nextLine());
        double minimalSalary = Float.parseFloat(scanner.nextLine());

        double scholarshipGrade = 0;
        double scholarshipSocial = 0;

        if (grade >= 5.5) {
            scholarshipGrade = grade * 25;
        }

        if (income < minimalSalary && grade > 4.5) {
            scholarshipSocial = 0.35 * minimalSalary;
        }

        if (scholarshipSocial == 0 && scholarshipGrade == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (scholarshipSocial >= scholarshipGrade) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarshipSocial));
        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipGrade));
        }
    }
}