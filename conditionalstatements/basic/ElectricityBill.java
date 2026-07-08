package conditionalstatements.basic;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int unit=sc.nextInt();

        if(unit<0){
            System.out.println("Invalid Unit");
        }else if(unit>300){
            System.out.println(unit*5);
        }else if(unit>100){
            System.out.println(unit*3);
        }else{
            System.out.println(unit*2);
        }

        sc.close();

    }
}
