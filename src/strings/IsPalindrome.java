package strings;

public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("race a car"));

    }
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        //remove non aplha numerics and return reverse of that
        StringBuilder nonAlphaStr = removeNonAlphanumeric(str);
        StringBuilder reversedString = new StringBuilder(nonAlphaStr);
        reversedString.reverse();
        return  checkPalindrome(nonAlphaStr.toString(),reversedString.toString());
    }

    private static StringBuilder removeNonAlphanumeric(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<string.length();i++){
            if(Character.isLetterOrDigit(string.charAt(i)))
                stringBuilder.append(string.charAt(i));
        }
        return stringBuilder;

    }
    private static boolean checkPalindrome(String orgStr,String reversedStr){
        for(int i=0;i<orgStr.length();i++){
            if(orgStr.charAt(i)!= reversedStr.charAt(i))
                return false;
        }
        return true;
    }
}
