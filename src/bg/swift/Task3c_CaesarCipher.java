package bg.swift;

import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String key = scanner.nextLine();
        char[]splitedSentence = sentence.toCharArray();

        for (char element :
                splitedSentence) {
            if (key.equals("encode")) {
                element++;
                System.out.printf("%s ", element);
            } else {
                element--;
                System.out.printf("%s ", element);
            }
        }
    }
}
