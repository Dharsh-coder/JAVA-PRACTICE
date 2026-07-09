package conditionalstatements.intermediate;

import java.util.Scanner;

public class GradeAndAttendance {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int mark =sc.nextInt();
        int attendance = sc.nextInt();

        if(mark>=0 && attendance>=0 && mark<=100 && attendance<=100){
            if(attendance>=75){
                if(mark>=90){
                    System.out.println("Grade A");
                }else if(mark>=75){
                    System.out.println("Grade B");
                }else if(mark>=50){
                    System.out.println("Grade C");
                }else{
                    System.out.println("Grade F");
                }
            }else{
                System.out.println("Fail due to low attendance");
            }            
        }else{
            System.out.println("Invalid input");
        }

        sc.close();

    }
}
