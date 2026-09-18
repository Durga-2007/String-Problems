import java.util.*;

public class p30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean visited = true;

        for(int i = 0; i < str.length(); i++) {

            for(int j = i + 1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    visited = false;
                    break;
                }
            }

            if(!visited) {
                break;
            }
        }

        System.out.println(visited);
    }
}