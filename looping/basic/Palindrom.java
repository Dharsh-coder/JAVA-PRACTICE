package looping.basic;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int orig = n;     
        int rev=0;
        if(n>=0){
            
            while(n>0){
                int t=n%10;
                rev = rev*10+t;
                n=n/10;
            }
            if(orig == rev ){
                System.out.println("Palindrome");
            }else{
            System.out.println("Not a Palindrome");
        }
        
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
    
}
