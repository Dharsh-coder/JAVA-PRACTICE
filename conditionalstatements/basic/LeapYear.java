package conditionalstatements.basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n%4==0){
            if(n%100 ==0){
                if(n%400 ==0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not Leap Year");
                }
            }
            else{
                System.out.println("leap Year");
            }
            
        }else{
            System.out.println("Not Leap Year");
        }

        sc.close();

    }
}
