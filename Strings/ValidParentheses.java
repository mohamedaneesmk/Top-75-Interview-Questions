package Strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        // String str = "()[]{}";
        String str = "()";
        // String str = "(]";
        // String str = "([)]";
        boolean isValidParenthesis = findValidParenthesis(str);
        System.out.println(isValidParenthesis);
    }

    private static boolean findValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) return false;  
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
