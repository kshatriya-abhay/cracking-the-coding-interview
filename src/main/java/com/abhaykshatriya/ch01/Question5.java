package com.abhaykshatriya.ch01;

/**
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class Question5 {
    public static void main(String[] args) {
        testIsOneAway("pale", "ple");
        testIsOneAway("pale", "pales");
        testIsOneAway("pale", "bale");
        testIsOneAway("pale", "bake");
        testIsOneAway("ababcbab", "ababcaab");
    }
    public static void testIsOneAway(String s1, String s2) {
        System.out.println(s1 + ", " + s2 + " -> " + isOneAway(s1, s2));
    }
    public static boolean isOneAway(String s1, String s2) {
        if (s1.length() < s2.length()) return isOneAway(s2, s1);
        if (s1.length() - s2.length() > 1) {
            return false;
        }
        int l = s2.length();
        boolean isSameLength = s1.length() == s2.length();
        boolean oneEdit = false;
        for (int i = 0, j = 0; j < l; i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (oneEdit) return false;
                oneEdit = true;
                if (!isSameLength) {
                    if (s1.charAt(i+1) != s2.charAt(j)) return false;
                    else i++;
                }
            }
        }
        return true;
    }
}
