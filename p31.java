import java.util.*;
public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] val = str.split(" ");
        String ans = "";
        int maxCount = 0;

        for(int i=0;i<val.length;i++){
             int count = val[i].length();
            
            if(count>maxCount){
                maxCount = count;
                ans = val[i];
            }
        }
        
        System.out.println(ans);   
    }
}
