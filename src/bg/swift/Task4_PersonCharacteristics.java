package bg.swift;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            int age = birthYear - Calendar.getInstance().get(Calendar.YEAR);
            System.out.println("Weight:");
            double weight = Double.parseDouble(scanner.nextLine());
            System.out.println("Height:");
            int height = Integer.parseInt(scanner.nextLine());
            System.out.println("Job:");
            String job = scanner.nextLine();


            int[] grades = new int[4];
            for (int i = 0; i < grades.length; i++) {
                grades[i] = scanner.nextInt();
            }
            double averageGrade = Arrays.stream(grades).average().orElse(Double.NaN);
            System.out.printf("%s %s is %d years old. ", firstName, lastName, age);
            if (gender == 'm' || gender == 'M') {
                System.out.printf("His weight is %.1f and he is %d cm tall. He is a %s with average grade of %.3f",
                        weight, height, job, averageGrade);
            } else {
                System.out.printf("Her weight is %.1f and she is %d cm tall. She is a %s with average grade of %.3f",
                        weight, height, job, averageGrade);
            }
        }
    }
}
