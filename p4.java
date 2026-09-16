import java.util.*;
public class p4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                count++;
            }else{
                count1++;
            }
        }
        System.out.println("Vowels: " + count);
        System.out.println("Consonants: " + count1);

    }
}