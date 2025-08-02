package stack;

import java.util.Stack;

public class CalPoints {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }
    public static int calPoints(String[] operations) {
        int sum = 0;
        Stack stack = new Stack();
        for (String str: operations){
            if(str.equals("+")){
                int current =(int) stack.pop();
                int add = current + (int) stack.peek();
                stack.push(current);
                stack.push(add);
            } else if (str.equals("D")) {
                stack.push((int) stack.peek() * 2);
            }else if(str.equals("C")){
                    stack.pop();
            }else {
                stack.push(Integer.parseInt(str));
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            sum = sum + (int) stack.pop();
        }

        return sum;
    }
}
