package com.abhaykshatriya.ch01;

/**
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
 * call to isSubstring (e.g.,"waterbottle" is a rotation of "erbottlewat").
 */
public class Question9 {
    public static void main(String[] args) {
        check("waterbottle", "erbottlewat");
    }
    public static void check(String s1, String s2) {
        System.out.println(s1 + ", " + s2 + " - " + isRotatedString(s1, s2));
    }
    public static boolean isRotatedString (String s1, String s2) {
        return s1.length() == s2.length() && isSubstring(s1 + s1.substring(0, s1.length()-1), s2);
    }
    public static boolean isSubstring(String largerString, String smallerString) {
        System.out.println("checking " + largerString + ", " + smallerString);
        int i;
        for (i = 0; i < largerString.length(); i++) {
            if (largerString.charAt(i) == smallerString.charAt(0)) {
                break;
            }
        }
        if (i < largerString.length()) {
            if (largerString.length() - i >= smallerString.length()) {
                return largerString.startsWith(smallerString, i);
            }
        }
        return false;
    }
}
