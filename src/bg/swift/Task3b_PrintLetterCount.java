package bg.swift;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        StringBuilder stringBuilder = new StringBuilder();
        String [] letter = scanner.nextLine().toLowerCase().split("");
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter.length; j++) {
                if (letter[i].equals(letter[j])) {
                   counter++;
                    stringBuilder.append(letter[i]).append(counter);
                    counter = 1;
                }
            }

        }
        System.out.println(stringBuilder);
    }
}
