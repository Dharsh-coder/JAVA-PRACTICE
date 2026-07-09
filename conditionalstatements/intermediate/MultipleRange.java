package conditionalstatements.intermediate;

import java.util.Scanner;

public class MultipleRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n>=0 && n<=150){
            if(n>50){
                if(n>100){
                    System.out.println("Range 3");
                }else{
                    System.out.println("Range 2");
                }               
            }else{
                System.out.println("Range 1");
            }
        }
        else{
            System.out.println("Out of Range");
        }
        
        sc.close();

    }
}
