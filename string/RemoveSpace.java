package string;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch != ' ') {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
