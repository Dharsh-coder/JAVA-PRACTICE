package looping.basic;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int larger =Math.max(a,b);
        int smaller = Math.min(a,b);
        int r=1;
        while(r>0){
            r=larger%smaller;
            larger=smaller;
            smaller=r;
        }
        System.out.println("GCD: "+larger);

        int LCM = (a*b)/larger;
        System.out.println("LCM:"+LCM);
        sc.close();
    }

}
