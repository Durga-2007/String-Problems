import java.util.*;
public class p46 {
    public static void generate(String s, int open, int close, int n,List<String> result) {
        if (open == n && close == n) {
            result.add(s);
            return;
        }
        if (open < n) {
            generate(s + "(", open + 1, close, n, result);
        }
        if (close < open) {
            generate(s + ")", open, close + 1, n, result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);
        System.out.println(result);
    }
}