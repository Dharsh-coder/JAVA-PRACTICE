package conditionalstatements.intermediate;

import java.util.Scanner;

public class AreaCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String shape = sc.next();

        switch (shape) {
            case "circle":
                double radius = sc.nextDouble();
                System.out.println((3.14*(radius*radius)));
                break;
            case "square":
                double side = sc.nextDouble();
                System.out.println((side*side));
                break;
            case "rectangle":
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                System.out.println((length*width));
                break;
            
            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
