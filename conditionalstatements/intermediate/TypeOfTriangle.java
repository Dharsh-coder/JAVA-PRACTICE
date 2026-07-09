package conditionalstatements.intermediate;

import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a<=0||b<=0||c<=0 ){
            System.out.println("Invalid Triangle");
        }
        else if((a+b)>c){
            if((b+c)>a){
                if((a+c)>b){
                    if(a==b && b==c){
                        System.out.println("Equilateral Triangle");
                    }
                    else if((a==b && a!=c) || (a!=b && a==c) || (a!=b && b==c)){
                        System.out.println("Isosceles Triangle");
                    }
                    else{
                        System.out.println("Scalene Triangle");
                    }
                }
                else{
                    System.out.println("Invalid Triangle");
                }
            }
            else{
                System.out.println("Invalid Triangle");
            }  
        }
        else{
            System.out.println("Invalid Triangle");
        }   
        sc.close();
    }
}
