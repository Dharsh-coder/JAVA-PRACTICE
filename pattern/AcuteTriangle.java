package pattern;

import java.util.Scanner;

public class AcuteTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int k=space;k>0;k--){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space-=1;
            System.out.println();
        }
        sc.close();
    }
}
