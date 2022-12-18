package com.abhaykshatriya.ch01;

import java.util.HashMap;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class Question2 {

    public static void main(String[] args) {
        String s1 = "abhay";
        String s2 = "abha";
        String s3 = "yahba";
        String s4 = "abaaz";
        assert !checkPermutation(s1, s2);
        assert checkPermutation(s1, s3);
        assert !checkPermutation(s1, s4);
    }
    public static boolean checkPermutation(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i))-1);
            } else {
                return false;
            }
        }
        for (Character ch : map.keySet()) {
            if (map.get(ch) != 0) {
                return false;
            }
        }
        return true;
    }
}
