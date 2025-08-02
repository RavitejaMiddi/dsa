package stack;

import java.util.Stack;

public class ClearDigits {

    public static void main(String[] args) {
        System.out.println(clearDigits("abc"));
    }
    public static String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        Stack stack = new Stack();

        for(int i=0;i<s.length();i++){
            var temp = s.charAt(i);
            if(Character.isLetter(temp))
                stack.push(temp);
            else
                 if(!stack.isEmpty())stack.pop();
        }
        while(!stack.isEmpty())
            str.append(stack.pop());
        return str.reverse().toString();
    }
}
