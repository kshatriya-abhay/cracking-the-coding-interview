package com.abhaykshatriya.ch01;

import java.util.HashSet;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin
 * drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
 */
public class Question4 {
    public static void main(String[] args) {
        String s1 = "Tact Coa";
        System.out.println(s1 + " " + isPermutationOfPalindrome(s1));
        String s2 = "Abhay K";
        System.out.println(s2 + " " + isPermutationOfPalindrome(s2));
        String s3 = "Abba";
        System.out.println(s3 + " " + isPermutationOfPalindrome(s3));
    }
    public static boolean isPermutationOfPalindrome(String s) {
        HashSet<Character> letterSet = new HashSet<>();
        for (int i=0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') continue;
            ch = Character.toLowerCase(ch);
            if (letterSet.contains(ch)) {
                letterSet.remove(ch);
            } else {
                letterSet.add(ch);
            }
        }
        return letterSet.size() < 2;
    }
}
