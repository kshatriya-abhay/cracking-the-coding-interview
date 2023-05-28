package com.abhaykshatriya.ch02;

import com.abhaykshatriya.structures.Node;

/**
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input:
 * Output:
 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
 * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class Question4 {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);
        System.out.println(head);
        head = head.partition(5);
        System.out.println(head);
    }
}
