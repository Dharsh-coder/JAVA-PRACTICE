package conditionalstatements.basic;

import java.util.Scanner;

public class IsVowelConsonant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char n=sc.next().charAt(0);
        n=Character.toLowerCase(n);
        if(Character.isLetter(n)){
            if(n=='a' || n=='e' || n=='i' || n=='u' || n=='o'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        }else{
            System.out.println("Not a letter");
        }

        
        sc.close();

    }
}
