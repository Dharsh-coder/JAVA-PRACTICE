package looping.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int a=0;
        int b = 1;
        int c;
        if(n<0){
            System.out.println("Invalid");
        }else{

        
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.print(a+" ");
            System.out.print(b);
        }else{
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=2;i<n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
                c=0;
            }
        }
    }
        sc.close();
    }
}
