package amigoscodeDataStructureProblems;

import java.util.Stack;

public class ParenthesesChecker {

    public boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (
                    stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
