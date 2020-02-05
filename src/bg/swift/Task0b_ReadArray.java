package bg.swift;

import java.util.Arrays;
import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
        String readArray = Arrays.toString(arr).replace("[", "").replace("]", "");
        System.out.println(readArray);
    }
}
