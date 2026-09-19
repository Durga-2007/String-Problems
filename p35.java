import java.util.*;
public class p35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] val = str.split(" ");
        for(int i = 0; i < val.length; i++) {

            int count = 0;

            for(int j = 0; j < val[i].length(); j++) {

                char ch = val[i].charAt(j);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}