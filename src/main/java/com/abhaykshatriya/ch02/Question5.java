package com.abhaykshatriya.ch02;

import com.abhaykshatriya.structures.Node;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7 -> 1 -> 6) + (5 -> 9 -> 2).That is, 617 + 295.
 * Output: 2 -> 1 -> 9. That is, 912.
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * Input:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output: 9 -> 1 -> 2. That is, 912.
 */
public class Question5 {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.appendToTail(9);
        n1.appendToTail(9);
        Node n2 = new Node(9);
        Node ans = Node.addNumbers(n1, n2);
        System.out.println(ans);
        System.out.println(Node.addTwoNumbersNotReversed(n1, n2));
    }

}
