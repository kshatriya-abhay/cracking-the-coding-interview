package com.abhaykshatriya.ch01;

/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class Question6 {
    public static void main(String[] args) {
        testCompressString("aabcccaaa");
        testCompressString("abcd");
        testCompressString("aabbcc");
        testCompressString("aabbc");
        testCompressString("aabbccc");
    }
    public static void testCompressString(String s) {
        System.out.println(s + " -> " + compressString(s));
    }
    public static String compressString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stringBuilder.append(ch);
            int count = 1;
            for (; i+1 < s.length(); i++) {
                if (s.charAt(i+1) == ch) count++;
                else break;
            }
            stringBuilder.append(count);
        }
        return stringBuilder.length() <= s.length() ? stringBuilder.toString() : s;
    }
}
