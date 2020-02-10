package bg.swift;

import java.util.Arrays;
import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter % 3 == 0) {
                System.out.println(arr[i]);
                break;
            }
            counter = 0;
        }
    }
}
