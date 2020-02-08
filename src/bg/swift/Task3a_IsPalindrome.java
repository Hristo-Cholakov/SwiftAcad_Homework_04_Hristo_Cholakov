package bg.swift;

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrome = true;
        String[] wordChecker = scanner.nextLine().split("");

        for (int i = 0, j = wordChecker.length-1; i <= wordChecker.length/2 && j>= wordChecker.length/2 ; i++, j--) {
            if (!wordChecker[i].equals(wordChecker[j])) {
                isPalindrome = false;
                break;
            }

        }
        System.out.println(isPalindrome);
    }
}
