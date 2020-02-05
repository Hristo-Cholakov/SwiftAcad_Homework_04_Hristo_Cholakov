package bg.swift;

public class Task0d_Print2dArray {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int initVal = 1;
        int[][] array2d = new int[4][4];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2d[i][j] = initVal;
                initVal++;
            }
            }
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d  ", array2d[i][j]);
            }
            System.out.println();
        }
    }
}
