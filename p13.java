import java.util.*;
 public class p13
 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String org = str.toLowerCase();

        String rev = "";
        for(int i=org.length() - 1;i>=0;i--){
            char ch = org.charAt(i);
            rev = rev + ch;
        }
        if(org.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
 }