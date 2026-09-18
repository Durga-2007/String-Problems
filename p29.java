import java.util.*;
public class p29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char max = str.charAt(0);
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) > max) {
                max = str.charAt(i);
            }
        }
        System.out.println(max);
    }
}