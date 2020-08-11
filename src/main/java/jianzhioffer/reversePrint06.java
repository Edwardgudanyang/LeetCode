package main.java.jianzhioffer;

import java.util.Stack;

public class reversePrint06 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        ListNode h = head;
        Stack<Integer> stack = new Stack<>();
        while (h != null) {
            stack.push(h.val);
            h = h.next;
        }
        int count=stack.size();
        int[] result=new int[count];
        for(int i=0;i<count;i++){
            result[i]=stack.pop();
        }
        return result;
    }
}
