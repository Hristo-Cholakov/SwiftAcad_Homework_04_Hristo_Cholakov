package bg.swift;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 1; j <str1.length(); j++) {
                if (str1.substring(i, j).matches(str2)) {
                    System.out.println(str1.substring(i, j));
                }
            }
        }
        }

    }

