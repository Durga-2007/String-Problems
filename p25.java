import java.util.*;
 public class p25{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
            int count = 0;

            boolean visited = false;
            for(int k =0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    visited = true;
                    break;
                }
            }
            if(visited){
                continue;
            }

            for(int j =0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            
            if(count>1){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}