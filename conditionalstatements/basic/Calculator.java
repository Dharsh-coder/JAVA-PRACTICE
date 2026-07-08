package conditionalstatements.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        char c = sc.next().charAt(0);
        b=sc.nextInt();
        

        if(c == '+'){
            System.out.println("Addition:"+(a+b));
        }else if(c=='-'){
            System.out.println("Subtraction:"+(a-b));
        }else if(c=='*'){
            System.out.println("Multiplication:"+(a*b));
        }else if(c=='/'){
            if(b==0){
                System.out.println("Divisible by zero is not allowed");
            }
            else{
                System.out.println("Division:"+(a/b));
            }
        }
        else{
            System.out.println("Invalid operator");
        }

        sc.close();

    }
}
