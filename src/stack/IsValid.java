package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }
    public static boolean isValid(String s) {
        Stack st = new Stack();
        HashSet set = new HashSet(Arrays.asList('(','{','['));

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                st.push(s.charAt(i));
            } else if(!st.isEmpty()){
                if((char)st.peek() == '(' && s.charAt(i) == ')'){
                    st.pop();
                }else if((char)st.peek() == '{' && s.charAt(i) == '}'){
                    st.pop();
                }else if((char)st.peek() == '[' && s.charAt(i) == ']'){
                    st.pop();
                }else
                    return false;
            }else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
