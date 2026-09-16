import java.util.*;
public class p6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }else if(!Character.isLetter(ch) && !Character.isWhitespace(ch)){
                count1++;
            }
        }   
        
        System.out.println("Digits: " + count);
        System.out.println("Special Characters: " + count1);
    }
}