import java.util.*;
public class p5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0;i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }else{
                count1++;
            }
        }
        System.out.println("UpperCase : " + count);
        System.out.print("LowerCase : " + count1);
    }
}