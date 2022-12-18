package com.abhaykshatriya.ch01;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */
public class Question1 {
    public static void main(String[] args) {
        String s1 = "abhay";
        boolean result1 = isStringWithUniqueCharacters(s1);
        printOutput(s1, result1);
        assert !result1;
        String s2 = "akhil";
        boolean result2 = isStringWithUniqueCharacters(s2);
        printOutput(s2, result2);
        assert !result2;
        String s3 = "abhay";
        boolean result3 = isStringWithUniqueCharactersNoAdd(s3);
        printOutput(s3, result3);
        assert !result3;
        String s4 = "akhil";
        boolean result4 = isStringWithUniqueCharactersNoAdd(s4);
        printOutput(s4, result4);
        assert !result4;
    }

    public static boolean isStringWithUniqueCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        return true;
    }

    public static boolean isStringWithUniqueCharactersNoAdd(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i+1]) return false;
        }
        return true;
    }

    private static void printOutput(String s, boolean isUnique) {
        if (isUnique) {
            System.out.println(s + " is a unique string");
        } else {
            System.out.println(s + " is not unique");
        }
    }
}
