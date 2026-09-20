import java.util.*;
public class p38{
    public static boolean isPalindrome(String str, int left, int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean result = true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                result = isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1);
                break;
            }
            left++;
            right--;
        }
        System.out.println(result);
    }
}