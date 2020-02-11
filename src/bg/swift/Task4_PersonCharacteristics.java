package bg.swift;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter people count:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int a = 0; a < n; a++) {

            System.out.println("First name:");
            String firstName = scanner.nextLine();
            System.out.println("Last name:");
            String lastName = scanner.nextLine();
            System.out.println("Gender:");
            String gen = scanner.nextLine();
            char gender = gen.charAt(0);
            System.out.println("Birth year:");
            int birthYear = Integer.parseInt(scanner.nextLine());
            int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
            System.out.println("Weight:");
            double weight = Double.parseDouble(scanner.nextLine());
            System.out.println("Height:");
            int height = Integer.parseInt(scanner.nextLine());
            System.out.println("Job:");
            String job = scanner.nextLine();


            double[] grades = new double[4];
            for (int i = 0; i < 4 ; i++) {
                System.out.println("Enter grades:");
                grades[i] = Double.parseDouble(scanner.nextLine());
            }
            double averageGrade = Arrays.stream(grades).average().orElse(Double.NaN);
            System.out.printf("%s %s is %d years old. ", firstName, lastName, age);
            if (gender == 'm' || gender == 'M') {
                System.out.printf("His weight is %.1f and he is %d cm tall. He is a %s with average grade of %.3f.%n",
                        weight, height, job, averageGrade);
            } else {
                System.out.printf("Her weight is %.1f and she is %d cm tall. She is a %s with average grade of %.3f.%n",
                        weight, height, job, averageGrade);
            }
            if (age < 18 && gender == 'm') {
                System.out.println("He is under age.");
            } else if (age < 18 && gender == 'f') {
                System.out.println("She is under age.");
            }
        }
    }
}
