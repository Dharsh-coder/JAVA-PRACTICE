package conditionalstatements.intermediate;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operation = sc.next();

        switch (operation) {
            case "addition":
                System.out.println((a+b));
                break;
            case "subtraction":
                System.out.println((a-b));
                break;
            case "multiplication":
                System.out.println((a*b));
                break;
            case "division":
                System.out.println((a/b));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
        sc.close();
    }
}
