import java.util.*;
public class p37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] val = str.split(" ");
        int count = 0;
        for(int i=0;i<val.length;i++){
            StringBuilder rev = new StringBuilder();
            for(int j=val[i].length()-1;j>=0;j--){
                rev.append(val[i].charAt(j));
            }
            if(val[i].equals(rev.toString())){
                count++;
                
            }
        }
        System.out.print(count);
    }
}