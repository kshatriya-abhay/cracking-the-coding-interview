package com.abhaykshatriya.structures;

import java.util.HashSet;

public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        Node end  = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void removeDuplicates() {
        Node n = this;
        Node prev = null;
        HashSet<Integer> hashSet = new HashSet<>();
        while (n != null) {
            if (hashSet.contains(n.data)) {
                prev.next = n.next;
            } else {
                hashSet.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }

    public void removeDuplicatesNoBuffer() {
        Node n = this;
        while (n != null) {
            Node prev = n;
            Node curr = n.next;
            while (curr != null) {
                if (curr.data == n.data) {
                    prev.next = curr.next;
                } else {
                    prev = curr;
                }
                curr = curr.next;
            }
            n = n.next;
        }
    }

    public Node kthToLast(int k) {
        // k = 1 means 2nd last element
        Node kth = this;
        Node last = this;
        // offset last by k
        for (int i = 0; i < k && last != null; i++) {
            last = last.next;
        }
        if (last == null) return null;
        while (last.next != null) {
            last = last.next;
            kth = kth.next;
        }
        return kth;
    }

    public void removeThisMiddleNode() {
        assert this.next != null;
        this.data = this.next.data;
        this.next = this.next.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node n = this;
        while (n != null) {
            sb.append(n.data);
            if (n.next != null) {
                sb.append(", ");
            }
            n = n.next;
        }
        return sb.toString();
    }

    public int getData() {
        return data;
    }

    public void removeSecondElement() {
        this.next.removeThisMiddleNode();
    }

    public Node partition(int x) {
        Node curr = this;
        Node left = null;
        Node leftCurr = null;
        Node right = null;
        Node rightCurr = null;
        while (curr != null) {
            if (curr.data < x) {
                if (left == null) {
                    left = new Node(curr.data);
                    leftCurr = left;
                } else {
                    leftCurr.next = new Node(curr.data);
                    leftCurr = leftCurr.next;
                }
            } else {
                if (right == null) {
                    right = new Node(curr.data);
                    rightCurr = right;
                } else {
                    rightCurr.next = new Node(curr.data);
                    rightCurr = rightCurr.next;
                }
            }
            curr = curr.next;
        }
        if (leftCurr != null) {
            leftCurr.next = right;
            return left;
        } else {
            return right;
        }
    }

    public static Node addNumbers(Node n1, Node n2) {
        Node ans = null;
        Node ans_tail = null;
        int carry = 0;
        while (n1 != null || n2 != null) {
            int a = carry;
            if (n1 != null) {
                a += n1.getData();
                n1 = n1.next;
            }
            if (n2 != null) {
                a += n2.getData();
                n2 = n2.next;
            }
            carry = a / 10;
            a = a % 10;
            if (ans == null) {
                ans = new Node(a);
                ans_tail = ans;
            } else {
                ans_tail.next = new Node(a);
                ans_tail = ans_tail.next;
            }
        }
        if (carry > 0) {
            ans_tail.next = new Node(carry);
        }
        return ans;
    }

    public Node reverseList() {
        Node ans = null;
        Node n = this;
        while(n != null) {
            Node node = new Node(n.data);
            node.next = ans;
            ans = node;
            n = n.next;
        }
        return ans;
    }

    public static Node addTwoNumbersNotReversed(Node n1, Node n2) {
        return addNumbers(n1.reverseList(), n2.reverseList()).reverseList();
    }

    public boolean isPalindrome() {
        return this.listEquals(this.reverseList());
    }

    public boolean listEquals(Object obj) {
        if (obj instanceof Node) {
            Node n2 = (Node) obj;
            Node n1 = this;
            while(n1 != null && n2 != null) {
                if (n1.data != n2.data) return false;
                n1 = n1.next;
                n2 = n2.next;
            }
            return n1 == null && n2 == null;
        } else return super.equals(obj);
    }
}
