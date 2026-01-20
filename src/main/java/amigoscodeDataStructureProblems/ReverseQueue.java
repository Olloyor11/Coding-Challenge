package amigoscodeDataStructureProblems;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public void reverseQueue(Queue<Integer> queue) {
        // Step 1: Create a stack
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());

        }
    }
}
