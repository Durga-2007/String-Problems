import java.util.*;
public class p10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = ch;
            System.out.println(ch +"="+ ascii );
        }
        
    }
}