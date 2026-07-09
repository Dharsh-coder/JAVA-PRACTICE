package conditionalstatements.intermediate;

import java.util.Scanner;

public class BMIClassification {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double weight =sc.nextDouble();
        double height = sc.nextDouble();

        if(height>0 && weight>0){
            double BMI = weight / (height * height);            
            if(BMI>=30){
                System.out.println("Obese");
            }else if(BMI>=25){
                System.out.println("OverWeight");
            }else if(BMI>=18.5){
                System.out.println("Normal");
            }else{
                System.out.println("Underweight");
            }                      
        }else{
            System.out.println("Invalid input");
        }

        sc.close();

    }
}
