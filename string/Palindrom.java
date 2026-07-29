package string;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // StringBuilder sb = new StringBuilder();

        // for(int i=(str.length()-1);i>=0;i--){
        //     char ch = str.charAt(i);
        //     sb.append(ch);
        // }
        // if(sb.equals(str)){
        //     System.out.println("Palindrom");
        // }else{
        //     System.out.println("not a palindrom");
        // }
        int right=str.length()-1;
        boolean flag = true;
        for(int left=0;left<right;left++){
            char chl = str.charAt(left);
            char chr = str.charAt(right);
            if(chl == chr){
                right--;
            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a palindrom");
        }
        sc.close();
    }
}
