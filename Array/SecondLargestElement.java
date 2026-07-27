package Array;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int large = Integer.MIN_VALUE;
        int secdLarge = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(large<arr[i]){
                secdLarge = large;
                large = arr[i];
            }else if(secdLarge<arr[i] && large!=arr[i]){
                secdLarge = arr[i];
            }else{
                continue;
            }
        }
        if(secdLarge==Integer.MIN_VALUE){
            System.out.println("No second Large element");
        }else{
            System.out.println(secdLarge);
        }
        sc.close();
    }
}
