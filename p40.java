import java.util.*;

public class p40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean result = true;

        if (str1.length() > str2.length()) {
            result = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}