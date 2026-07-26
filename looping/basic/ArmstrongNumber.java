package looping.basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orig =n;
        int digits = 0;
        while(n>0){
            
            digits++;
            n/=10;
        }
        n=orig;
        int sum=0;
        while(n>0){
            int r = n%10;
            int mul=1;
            for(int i=0;i<digits;i++){
                
            mul = mul*r;
            
        }
            sum+=mul;
            n/=10;
          }
        
        if(orig==sum){
            System.out.println("It is an Armstrong Number");
        }else{
            System.out.println("It is not an Armstrong Number");
        }
        sc.close();
    }
}
