import java.util.*;
 public class p27
 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean anagram = true;
        for(int i=0;i<str1.length();i++){
            int count1 = 0;
            int count2 =0;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    count1++;
                }
            }
            for(int k=0;k<str2.length();k++){
                if(str1.charAt(i)==str2.charAt(k)){
                    count2++;
                }
            }
            if(count1!=count2){
                anagram = false;
                break;
            }
        }
        System.out.println(anagram);
    }   
 }