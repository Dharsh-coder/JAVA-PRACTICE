package conditionalstatements.basic;
// 3.	Find the largest of two numbers 
import java.util.Scanner;

public class LargestOfTwoNum {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        if(a>b){
            System.out.println("largest is "+a);
        }else{
            System.out.println("largest is "+b);
        }

        sc.close();

    }
}
