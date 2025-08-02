package stack;
 class Stack {
    private int[] stackArr = new int[10];
    private int size = -1;
    private int index = 0;
    public void push(int element) {
        if(index < stackArr.length) {
            stackArr[index++] = element;
            if (size == -1)
                size = 1;
            else
                size++;
        }else
            System.out.println("Stack is Full");
    }
    public void printEle(){
        for(int i=index-1;i>=0;i--){
            System.out.println(stackArr[i]);
        }
    }
    public int size(){
        return size;
    }
    public void pop(){
        if(size == -1)
            System.out.println("Stack is Empty");
        else {
            index--;
        }

    }

}
public class StackImpl {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.printEle();
        System.out.println(st.size());
        st.pop();
        st.printEle();


    }
}
