package stack;

import java.util.Stack;

public class BackspaceCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));

    }
    public static boolean backspaceCompare(String s, String t) {
        Stack stackOfS = new Stack();
        Stack stackOfT = new Stack();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '#'){
                stackOfS.push(s.charAt(i));
            }else if(!stackOfS.isEmpty()) {
                stackOfS.pop();
            }
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i) != '#'){
                stackOfT.push(t.charAt(i));
            }else if(!stackOfT.isEmpty()) {
                stackOfT.pop();
            }
        }

        while (!stackOfS.isEmpty() && !stackOfT.isEmpty()){
            if(stackOfS.pop() != stackOfT.pop())
                return false;
        }

        return stackOfS.isEmpty() && stackOfT.isEmpty();
    }
}
