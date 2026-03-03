package ss10;

import java.util.*;

public class DemoStack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//
//        System.out.println(stack);

        Queue<Integer> queue = new PriorityQueue<>();

        // 6,2,4,1,3,0
        queue.offer(1);
        queue.offer(3);
        System.out.println(queue);
        queue.offer(4);
        System.out.println(queue);
        queue.offer(6);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.offer(3);
        System.out.println(queue);
        queue.offer(7);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.offer(1);
        System.out.println(queue);
        queue.offer(0);
        System.out.println(queue);
//        queue.poll();
//        System.out.println(queue);
//        queue.poll();
//        System.out.println(queue);
    }
}
