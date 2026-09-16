import java.util.*;
public class p9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char val = sc.next().charAt(0);
        int count = 0;
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == val){
                count++;
            }
        }
        System.out.print(count);
    }
}