package com.leetcode.easy;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head){

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (slowPointer != null &&
                fastPointer != null &&
                fastPointer.next !=null){

            slowPointer = slowPointer.next;
            fastPointer = slowPointer.next.next;


            if (slowPointer == fastPointer){
                return true;
            }
        }
        return false;

    }
}
