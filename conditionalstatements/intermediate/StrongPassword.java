package conditionalstatements.intermediate;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String password = sc.nextLine();
        int lower=0;
        int upper=0;
        int digit=0;
        int splChar=0;
        int alpha=0;
        int n=password.length();
        if(n>=8){
            for(int i=0;i<password.length();i++){
                char ch = password.charAt(i);
                if(ch!=' '){
                    if(ch>='a' && ch<='z'){
                        lower++;  
                        alpha++;      
                    }else if(ch>='A' && ch<='Z'){
                        upper++;
                        alpha++;
                    }else if(ch>='0' && ch<='9'){
                        digit++;
                        alpha++;
                    }else{
                        splChar++;
                        alpha++;
                    }
                }else{
                    System.out.println("Weak password");
                    break;
                }
            
            }
            if(alpha == n){
                if(lower>0 && upper>0 && digit>0 && splChar>0){
                    System.out.println("Strong Password");
                }else{
                    System.out.println("Weak password");
                }
            }
        }else{
            System.out.println("Weak password");
        }
        sc.close();

    }
}
