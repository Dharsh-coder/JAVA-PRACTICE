package conditionalstatements.basic;
// 6.	Check if a person is eligible to vote 
import java.util.Scanner;

public class voteEligible {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n>18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }

        sc.close();

    }
}
