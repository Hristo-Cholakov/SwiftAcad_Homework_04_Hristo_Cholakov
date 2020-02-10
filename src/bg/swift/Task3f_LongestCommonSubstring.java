package bg.swift;

import java.util.Scanner;

public class Task3f_LongestCommonSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String longestSubSeq = "";
        int longest = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <=str1.length(); j++) {
                if (str2.contains(str1.substring(i, j)) && str1.substring(i, j).length()>longest) {
                    longest =str1.substring(i, j).length();
                    longestSubSeq = str1.substring(i, j);
                }
            }
        }
        System.out.println(longestSubSeq);
    }
}

