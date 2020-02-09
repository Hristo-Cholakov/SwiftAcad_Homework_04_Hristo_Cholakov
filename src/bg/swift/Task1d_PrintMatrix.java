package bg.swift;

import java.util.Scanner;

public class Task1d_PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        int plusOne = 1;
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = plusOne;
                plusOne++;
                if (j == n-1){
                    for (int k = i + 1; k < matrix.length; k++) {
                        for (int l = j; l <matrix.length; l++) {
                            matrix[l][k] = plusOne;
                        }
                    }
                }
            }
        }
    }
}
