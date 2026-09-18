import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxCount = 1;
        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        System.out.println(maxCount);
        
    }
}