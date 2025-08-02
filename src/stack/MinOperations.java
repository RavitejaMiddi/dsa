package stack;

import java.util.Stack;

public class MinOperations {
    public static void main(String[] args) {

        System.out.println(minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));

    }
    public static int minOperations(String[] logs) {
        int minOperationsReq = 0;
        Stack stack = new Stack();
        for (String str: logs) {
            if (str.equals("../") && !stack.isEmpty()) {
                stack.pop();
                minOperationsReq--;
            } else if (str.equals("./"))
                continue;
            else if(!str.isEmpty() && Character.isLetterOrDigit(str.charAt(0))){
                stack.push(str);
                minOperationsReq++;
            }
        }
        return minOperationsReq;
    }
}
