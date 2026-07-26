package looping.basic;

import java.util.Scanner;

public class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orig = n;
        int sum =0;
        while(n>0){
            int r = n%10;
            int fact = 1;
            for(int i=1;i<=r;i++){
                fact *=i;
            }
            sum+=fact;
            n/=10;
        }
        
        if(orig==sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
        sc.close();
    }
}