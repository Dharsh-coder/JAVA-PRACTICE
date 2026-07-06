package conditionalstatements.basic;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n>=0){
            System.out.println("Absolute value is "+n);
        }else{
            System.out.println("Absolute value is "+(-n));
        }

        sc.close();

    }
}
