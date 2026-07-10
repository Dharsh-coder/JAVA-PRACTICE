package looping.basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int fact =1;
        if(n>=0){
            for(int i=n;i>=2;i--){
                fact*=i;
            }
            System.out.println(fact);
        }else{
            System.out.println("Undefined");
        }
        
        
        sc.close();
    }
}
