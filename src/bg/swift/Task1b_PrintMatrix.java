package bg.swift;

import java.util.Scanner;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plusOne = 1;
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][i] = plusOne;
                plusOne++;
                if (j == n - 1) {
                    i++;
                    for (int k = j; k >= 0; k--) {
                        matrix[k][i] = plusOne;
                        plusOne++;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
