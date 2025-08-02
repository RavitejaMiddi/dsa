package twopointer;

public class Palindrome {

    public static void main(String[] args) {
         String s = "a dog a panic in a pagoda";
         int left = 0;
         int right = s.length()-1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(left) == ' ' ){
                left++;
            } else if (s.charAt(right)==' ') {
                right--;
            }

            if(left<=right){
                if(s.charAt(left) == s.charAt(right)){
                    left++;
                    right--;
                }else {
                    System.out.println("false");
                    return;
                }
            }

        }
    }


}
