package stack;

import java.util.Stack;

public class MakeGood {
    public static void main(String[] args) {

        System.out.println(makeGood("leEeetcode"));

    }
    public static String makeGood(String s) {
        StringBuilder str = new StringBuilder();
        Stack stack = new Stack();

        for(int i=0;i<s.length();i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else if(Math.abs((char)stack.peek() - s.charAt(i)) == 32){
                stack.pop();
            }else
                stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}
