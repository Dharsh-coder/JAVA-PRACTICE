package Array;

import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int secdSmall = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(small>arr[i]){
                secdSmall = small;
                small = arr[i];
            }else if(secdSmall>arr[i] && small != arr[i]){
                secdSmall = arr[i];
            }
        }
        if(secdSmall==Integer.MAX_VALUE){
            System.out.println("No small element");
        }else{
            System.out.println(secdSmall);
        }
        sc.close();
    }
}
