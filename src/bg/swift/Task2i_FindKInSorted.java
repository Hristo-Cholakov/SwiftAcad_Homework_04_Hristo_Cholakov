package bg.swift;

import java.util.Arrays;
import java.util.Scanner;

public class Task2i_FindKInSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] sortedArray = new int[n];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = scanner.nextInt();
        }
        int output = Arrays.binarySearch(sortedArray, k);
        if (output >= 0) {
            System.out.println(output);
        }else {
            System.out.println("NO");
        }

    }
}
