package stack;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveOuterParentheses {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("()()"));

    }
    public static String removeOuterParentheses(String s) {
        return getEachDecomposedString(decomposition(s));
    }
    public static String getEachDecomposedString(ArrayList<String> arrayList){
        StringBuilder str = new StringBuilder();

        for(String s:arrayList){
            str.append(s, 1, s.length()-1);
        }
        return str.toString();
    }

    //sub string - decomposition of string s = P1 + P2 + ... + Pk
    public  static ArrayList<String> decomposition(String s){
        ArrayList<String> array = new ArrayList<>();
        Stack stack = new Stack();
        int conter = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
            if(stack.isEmpty()){
                array.add(s.substring(conter,i+1));
                conter = i+1;
            }
        }
        return array;
    }
}
