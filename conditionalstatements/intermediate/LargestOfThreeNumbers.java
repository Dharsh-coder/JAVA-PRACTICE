package conditionalstatements.intermediate;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>=b){
            if(a>=c){
                System.out.println("largest is "+a);
            }else if(b>=c){
                System.out.println("largest is "+b);
            }else{
                System.out.println("largest is "+c);
            }
        }else if(b>=c){
            if(b>=a){
                System.out.println("largest is "+b);
            }           
        }else{
            System.out.println("largest is "+c);
        }

        sc.close();

    }
}
