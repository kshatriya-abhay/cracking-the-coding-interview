package com.abhaykshatriya.ch01;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters,and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
public class Question3 {
    public static void main(String[] args) {
        String s1 = "Abhay Kshatriya     ";
        char[] chs1 = s1.toCharArray();
        urlify(chs1, 16);
        System.out.println(chs1);
    }

    public static void urlify(char[] s, int l) {
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length; i++) {
            if (i < l) {
                if (s[i] == ' ') {
                    queue.add('%');
                    queue.add('2');
                    queue.add('0');
                } else {
                    queue.add(s[i]);
                }
            }
            s[i] = queue.remove();
        }
    }
}
