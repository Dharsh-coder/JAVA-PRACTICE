package conditionalstatements.basic;
// 4.	Find the smallest of two numbers 
import java.util.Scanner;

public class smallestTwoNum {
     public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        if(a<b){
            System.out.println("smallest is "+a);
        }else{
            System.out.println("smallest is "+b);
        }

        sc.close();

    }
}
