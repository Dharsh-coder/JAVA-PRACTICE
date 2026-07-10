package looping.basic;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int rev=0;
        if(n<0){
            n*=(-1);
            while(n>0){
                int t=n%10;
                rev = rev*10+t;
                n=n/10;
            }
        System.out.println(rev*(-1));
        }
        else{
            while(n>0){
                int t=n%10;
                rev = rev*10+t;
                n=n/10;
            }
            System.out.println(rev);
        }
        
        
        sc.close();
    }
}
