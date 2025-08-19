package heaps;


//Min Heap class
public class MinHeap {

    private int[] minHeapArr;
    private int capacity;
    private int currentHeapSize;

    public MinHeap(int n){
        capacity = n;
        minHeapArr = new int[capacity];
        currentHeapSize = 0;
    }

    public boolean insert(int val){
        //If heap is full return false;
        if(capacity == currentHeapSize)
            return false;

        int i = currentHeapSize;
        minHeapArr[i] = val;
        currentHeapSize++;

        while(i != 0 && minHeapArr[i] < minHeapArr[parent(i)]){
            swap(minHeapArr,i,parent(i));
            i = parent(i);
        }
        return true;
    }

    public boolean delete(){
        if(currentHeapSize == 0)
            return false;

        minHeapArr[0] = minHeapArr[--currentHeapSize];
        int i = 0;
        //currentHeapSize++;

        while (true){
            int left = leftChild(i);
            int right = rightChild(i);
            int smallest = i;

            // Find the smallest among parent and children
            if (left < currentHeapSize && minHeapArr[left] < minHeapArr[smallest]) {
                smallest = left;
            }
            if (right < currentHeapSize && minHeapArr[right] < minHeapArr[smallest]) {
                smallest = right;
            }
            if(smallest == i) break;
            swap(minHeapArr,i,smallest);
            i = smallest;
        }
        return true;

    }

    private void swap(int[] minHeapArr, int i, int parent) {
        int temp = minHeapArr[i];
        minHeapArr[i] = minHeapArr[parent];
        minHeapArr[parent] = temp;
    }

    private int parent(int i) {
        return (i-1)/2;
    }
    private int leftChild(int i){
        return 2 * i + 1;
    }
    private int rightChild(int i){
        return 2 * i + 2;
    }

    public int getMin(){
        return minHeapArr[0];
    }

    public void iterate(){
        for(int i=0;i<minHeapArr.length;i++){
            if(leftChild(i) <= currentHeapSize && rightChild(i) <= currentHeapSize){
                System.out.println("parent : " + minHeapArr[i] +" left child : " + minHeapArr[leftChild(i)] + " right : "+ minHeapArr[rightChild(i)] );
            }

        }
    }

    public static void main(String[] args) {

        MinHeap heap = new MinHeap(10);
        heap.insert(1);
        heap.insert(3);
        heap.insert(6);
        heap.insert(5);
        heap.insert(9);
        heap.insert(8);

        heap.iterate();

        System.out.println(heap.getMin());

        heap.delete();
        heap.iterate();





    }
}
