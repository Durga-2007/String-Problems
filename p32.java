import java.util.*;
public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] val = str.split(" ");
        String ans = "";
        int minCount = Integer.MAX_VALUE;

        for(int i=0;i<val.length;i++){
             int count = val[i].length();
            
            if(count<minCount){
                minCount = count;
                ans = val[i];
            }
        }
        
        System.out.println(ans);   
    }
}
