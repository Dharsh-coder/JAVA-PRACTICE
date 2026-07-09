package conditionalstatements.intermediate;

import java.util.Scanner;

public class RootOfQuadraticEquation {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int d = (b*b) - (4*a*c);
        if(a!=0){
            if(d>0){
                System.out.println("Two Real Roots");
            }else if(d==0){
                System.out.println("One Real Root");
            }else{
                System.out.println("Imaginary Roots");
            }
        }
        else{
            System.out.println("Not a Quadratic Equation");
        }

        sc.close();

    }
}
