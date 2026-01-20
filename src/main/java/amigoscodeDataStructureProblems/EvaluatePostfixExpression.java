package amigoscodeDataStructureProblems;

import java.util.Stack;

public class EvaluatePostfixExpression {
    public int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                int result;

                if (token.equals("+")) {
                    result = firstNum + secondNum;

                } else if (token.equals("-")) {
                    result = firstNum - secondNum;

                } else if (token.equals("*")) {
                    result = firstNum * secondNum;

                } else {
                    result = firstNum / secondNum;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();


    }


}
