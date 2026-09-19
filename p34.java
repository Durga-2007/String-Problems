import java.util.*;

public class p34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean ans = true;
        int j = 0;

        for(int i = 0; i < t.length(); i++) {

            if(j < s.length() && s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }

        if(j != s.length()) {
            ans = false;
        }

        System.out.println(ans);
    }
}