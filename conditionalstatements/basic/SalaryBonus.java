package conditionalstatements.basic;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int salary=sc.nextInt();

        if(salary<0){
            System.out.println("Invalid Salary");
        }else if(salary>60000){
            System.out.println("Bonus is "+(5.0/100.0)*salary);
            System.out.println("Total Salary is "+ (salary+((5.0/100.0)*salary)));
        }else if(salary>=30000 && salary<=60000){
            System.out.println("Bonus is "+ (10.0/100.0)*salary);
            System.out.println("Total salary is "+(salary + ((10.0/100.0)*salary)));
        }else{
            System.out.println("Bonus is "+(20.0/100.0)*salary);
            System.out.println("Total Salary is "+(salary + ((20.0/100.0)*salary)));
        }

        sc.close();

    }
}
