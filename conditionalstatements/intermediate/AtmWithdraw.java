package conditionalstatements.intermediate;

import java.util.Scanner;

public class AtmWithdraw {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int balance =sc.nextInt();
        int amount = sc.nextInt();

        if(balance>0 && amount>0){
            if(amount<=balance){
                if((balance-amount)>=500){
                    System.out.println("Withdraw Successful");
                System.out.println("Remaining Balance: "+(balance-amount));
                }
                else{
                    System.out.println("Minimum balance should be ₹500");
                }
            }else{
                System.out.println("Insufficient Balance");
            }            
        }else{
            System.out.println("Invalid entry");
        }

        sc.close();

    }
}
