package leetCode.有效的括号;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        if (s.length() <= 1 || s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                    stack.push(ch);
                }
            }
        return stack.isEmpty();
    }



}
