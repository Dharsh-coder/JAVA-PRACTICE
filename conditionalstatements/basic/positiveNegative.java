package conditionalstatements.basic;
//1.	Check if a number is positive or negative 
import java.util.Scanner;
public class positiveNegative {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n>=0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

        sc.close();

    }
}
