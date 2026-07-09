package conditionalstatements.intermediate;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a>0 && b>0 && c>0){
            if((a+b+c)==180){
                System.out.println("Valid Triangle");
            }else{
                System.out.println("Invalid Triangle");
            }
        }else{
            System.out.println("Invalid Triangle");
        }

        sc.close();

    }
}
