package com.abhaykshatriya.ch02;

import com.abhaykshatriya.structures.Node;

public class Question6 {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.appendToTail(2);
        n1.appendToTail(2);
//        n1.appendToTail(1);
        System.out.println(n1.isPalindrome());
    }
}
