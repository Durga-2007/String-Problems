import java.util.*;
 public class p26{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
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
            System.out.print(str.charAt(i)+" ");
        }
    }
}