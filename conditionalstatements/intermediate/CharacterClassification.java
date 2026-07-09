package conditionalstatements.intermediate;

import java.util.Scanner;

public class CharacterClassification {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char n=sc.next().charAt(0);
        
        if(n>='a' && n<='z'){
            System.out.println("LowerCase");        
        }else if(n>='A' && n<='Z'){
            System.out.println("UpperCase");
        }else if(n>='0' && n<='9'){
            System.out.println("Number");
        }else{
            System.out.println("Special Character");
        }

        
        sc.close();

    }
}
