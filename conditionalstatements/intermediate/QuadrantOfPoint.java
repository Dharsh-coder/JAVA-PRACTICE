package conditionalstatements.intermediate;

import java.util.Scanner;

public class QuadrantOfPoint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y = sc.nextInt();

        if(x==0){
            System.out.println("Y-Axis");
        }else if(y==0){
            System.out.println("X-Axis");
        }else if(x>0 && y>0){
            System.out.println("Quandrant I");
        }else if(x<0 && y>0){
            System.out.println("Quandrant II");
        }else if(x<0 && y<0){
            System.out.println("Quandrant III");
        }else if(x>0 && y<0){
            System.out.println("Quandrant I");
        }else{
            System.out.println("Origin");
        }
        

        sc.close();

    }
}
