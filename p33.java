import java.util.*;
public class p33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int min = Math.min(str1.length(),str2.length());
        String ans = "";
        for(int i=0;i<min;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                ans = ans + str1.charAt(i);
            }
        }
        System.out.print(ans);
          
    }
}