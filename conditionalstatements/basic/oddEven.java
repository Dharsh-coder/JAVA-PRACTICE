package conditionalstatements.basic;
//2.	Check if a number is even or odd 
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        sc.close();

    }
}
