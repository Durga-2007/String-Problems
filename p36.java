import java.util.*;
public class p36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] val = str.split(" ");
        String longest = "";
        for(int i=0;i<val.length;i++){
            StringBuilder rev = new StringBuilder();
            for(int j=val[i].length()-1;j>=0;j--){
                rev.append(val[i].charAt(j));
            }
            if(val[i].equals(rev.toString())){
                if(rev.toString().length() > longest.length()){
                    if(val[i].length() > longest.length()){
                        longest = val[i];
                    }
                }
            }
        }
        System.out.print(longest);
    }
}