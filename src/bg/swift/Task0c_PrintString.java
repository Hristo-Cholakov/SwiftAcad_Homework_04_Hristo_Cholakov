package bg.swift;

import java.util.Scanner;

public class Task0c_PrintString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] toBePrinted = input.toCharArray();

        for (char element : toBePrinted) {
            System.out.println(element);
        }
    }
}
