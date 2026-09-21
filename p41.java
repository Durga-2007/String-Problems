import java.util.*;

public class p41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int max = 0;

        for (int i = 0; i < str1.length(); i++) {
            String temp = "";
            for (int j = i; j < str1.length(); j++) {
                char ch = str1.charAt(j);
                if (temp.indexOf(ch) != -1) {
                    break;
                }
                temp = temp + ch;
                if (temp.length() > max) {
                    max = temp.length();
                }
            }
        }

        System.out.println(max);
    }
}

