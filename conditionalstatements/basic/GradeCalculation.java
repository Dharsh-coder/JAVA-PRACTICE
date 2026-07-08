package conditionalstatements.basic;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<0 || n>100 ){
            System.out.println("Invalid Marks");
        }
        else if(n>90){
            System.out.println("A");
        }else if(n>70){
            System.out.println("B");
        }else if(n>=50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }

        sc.close();

    }
}
