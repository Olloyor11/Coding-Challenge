package amigoscodeDataStructureProblems;

import java.util.Stack;

public class ReserveStringStack {
    public String reverse(String str) {
        // 1. Create a stack
        Stack<Character> stringStack = new Stack<>();

        // 2. Push all characters onto the stack
        //    (loop through the string)
        for (char c : str.toCharArray()) {
            stringStack.push(c);
        }
        // 3. Pop all characters and build the reversed string
        //    (loop while stack is not empty)
        StringBuilder reversed = new StringBuilder();
        while (!stringStack.isEmpty()) {
            reversed.append(stringStack.pop());

        }
        // 4. Return the reversed string
        return reversed.toString();
    }
}
