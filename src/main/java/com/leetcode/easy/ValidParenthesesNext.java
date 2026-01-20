package com.leetcode.easy;

import java.util.Stack;

public class ValidParenthesesNext {
    public boolean isValid(String parentheses){
        Stack<Character> characterStack = new Stack<>();
        for (char c : parentheses.toCharArray()){
            if (c == '('){
                characterStack.push(c);
            }else if (c == ')') {
                characterStack.peek().equals(c);

                if (characterStack.isEmpty()){
                    return false;
                }

            }
            characterStack.pop();
        }
     return characterStack.isEmpty();
    }

}
