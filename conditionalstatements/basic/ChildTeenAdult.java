package conditionalstatements.basic;

import java.util.Scanner;

public class ChildTeenAdult {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        if(n<0){
            System.out.println("Invalid Age");
        }
        else if(n>=18){
            System.out.println("Adult");
        }else if(n>12){
            System.out.println("Teen");        
        }else{
            System.out.println("Child");
        }

        sc.close();

    }
}
