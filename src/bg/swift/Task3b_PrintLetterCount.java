package bg.swift;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] letterByLetter = word.toCharArray();
        int[] alphabetChecker = new int[26];
        for (char letter : letterByLetter) {
            alphabetChecker[letter-97]++;
        }
        for (int i = 0; i < alphabetChecker.length; i++) {
            if (alphabetChecker[i] > 0) {
                char letter = (char) (i + 97);
                System.out.println(letter + " " + "(" + alphabetChecker[i] + ")");
            }
        }

    }
}

