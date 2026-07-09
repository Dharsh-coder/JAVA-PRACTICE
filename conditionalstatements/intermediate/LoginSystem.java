package conditionalstatements.intermediate;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String username=sc.nextLine();
        String password = sc.nextLine();

        if(username.equals("admin")){
            if(password.equals("java123")){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Invalid Password");
            }            
        }else{
            System.out.println("Invalid Username");
        }

        sc.close();

    }
}
