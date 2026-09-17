import java.util.*;
 public class p20
 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        for(int i = str.length() - 1;i>=0;i--){
            if(str.charAt(i)==ch){
                System.out.println(i);
                break;
            }
        }
    }   
 }