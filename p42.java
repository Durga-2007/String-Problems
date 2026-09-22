import java.util.*;

public class p42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            count += right - left + 1;
        }
        System.out.println(count);
    }
}