package conditionalstatements.basic;
// 7.	Check if a number is multiple of 3 and 7 
import java.util.Scanner;

public class multipleOf3and7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n%3==0 && n%7==0 ){
            System.out.println("It is multiple of 3 and 7");
        }else{
            System.out.println("Not a multiple of 3 and 7");
        }

        sc.close();

    }
}
