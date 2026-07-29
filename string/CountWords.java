package string;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch != ' ') && (i==0||str.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
