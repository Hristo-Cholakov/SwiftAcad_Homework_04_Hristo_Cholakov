package bg.swift;

public class Task3f_LongestCommonSubstring {
    static String findLCS(String str1, String str2) {
        int longest = 0;
        String longestSubstring = "";

        for (int i=0; i < str1.length(); ++i) {
            for (int j=i+1; j <= str1.length(); ++j) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring) && substring.length() > longest) {
                    longest = substring.length();
                    longestSubstring = substring;
                }
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String str1 = "ahasjaaakxmza";
        String str2 = "ahaooxmaaakxs";
        System.out.println(findLCS(str1, str2));
    }
}
