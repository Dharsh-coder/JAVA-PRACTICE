package conditionalstatements.basic;

import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        n=n.toLowerCase();
        if(n.equals("sunday")){   
            System.out.println("Weekend");
        }
        else if(n.equals("monday")){
            System.out.println("Weekday");
        
        }else if(n.equals("tuesday")){
            System.out.println("Weekday");
        }
        else if(n.equals("wednesday")){
            System.out.println("Weekday");
        }
        else if(n.equals("thursday")){
            System.out.println("Weekday");
        }
        else if(n.equals("friday")){
            System.out.println("Weekday");
        }
        else if(n.equals("saturday")){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Not a day");
        }   
        sc.close();
    }
}
