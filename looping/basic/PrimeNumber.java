package looping.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        boolean flag=true;
        if(n<=1){
            System.out.println("Invalid");
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        
    
        sc.close();
    }
}
