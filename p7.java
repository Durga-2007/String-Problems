import java.util.*;
public class p7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(Character.toUpperCase(ch));
        }
        
    }
}