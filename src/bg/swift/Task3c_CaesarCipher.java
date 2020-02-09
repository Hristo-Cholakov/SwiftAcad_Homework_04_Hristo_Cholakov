package bg.swift;

import java.util.Arrays;
import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String key = scanner.nextLine();
        char[]splitedSentence = sentence.toCharArray();
        String joinedSentence = "";

        for (int i = 0; i < splitedSentence.length; i++) {
            if (key.equals("encode")) {
                splitedSentence[i]++;
                joinedSentence = String.copyValueOf(splitedSentence).replace("!", " ").
                        replace("/", ".");
            }else {
                splitedSentence[i]--;
                joinedSentence = String.copyValueOf(splitedSentence).replace("\u001F", " ").
                        replace("-", ".");
            }
        }
        System.out.println(joinedSentence);
    }
}
