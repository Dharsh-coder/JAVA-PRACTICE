package conditionalstatements.basic;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        int Cost,Selling;
        Scanner sc = new Scanner(System.in);
        Cost=sc.nextInt();
        Selling=sc.nextInt();

        if(Cost>Selling){
            System.out.println("Loss is "+(Cost-Selling));
        }else if(Selling>Cost){
            System.out.println("Profit is "+(Selling-Cost));
        }else{
            System.out.println("No Profit No Loss");
        }

        sc.close();

    }
}
