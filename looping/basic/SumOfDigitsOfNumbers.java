package looping.basic;

import java.util.Scanner;

public class SumOfDigitsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int sum=0;
        if(n<0){
            n*=(-1);
            
        }
            while(n>0){
                int t=n%10;
                sum +=t;
                n=n/10;
            }
            System.out.println(sum);
        sc.close();
    }
}
