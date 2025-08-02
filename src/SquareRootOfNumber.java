public class SquareRootOfNumber {
    public static void main(String[] args) {

        int num = 11;
        binarySearchApproach(num);
        for(int i=1;i<=num /2 ;i++){
            if(i * i == num ) {
                System.out.println("Square root of num : " + num + " is : " + i);
                return;
            }
            else if (i * i > num){
                    System.out.println("Square root of num : " + num + " is : " + (i-1));
                    return;
                }
        }

    }

    public static void binarySearchApproach(int num){
        int low = 1;
        int high = num;
        int res = 1;

        while( low <= high){
            int mid =( low + high) / 2;
            if(mid  * mid <= num){
            res = mid;
            low = low + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(res);
    }
}
