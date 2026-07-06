package conditionalstatements.basic;

import java.util.Scanner;

public class IsZero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        if(n==0){
            System.out.println("Zero");
        }else{
            System.out.println("Not Zero");
        }

        sc.close();

    }
}
