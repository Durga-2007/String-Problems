import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int minCount = Integer.MAX_VALUE;
        char ch = ' ';
        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count < minCount){
                minCount = count;
                ch = str.charAt(i);
            }
        }
        System.out.println(ch);
        
    }
}