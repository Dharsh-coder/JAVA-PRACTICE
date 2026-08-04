package pattern;

import java.util.Scanner;

class Pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=n;
        for(int i=1;i<=n;i++){
            for(int s=space-1;s>=0;s--){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i+i-1;j++){

                System.out.print("*");
            }
            System.out.println();
            space =space-1;
        }
        sc.close();
    }
}