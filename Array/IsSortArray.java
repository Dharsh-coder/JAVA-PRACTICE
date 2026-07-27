package Array;

import java.util.Scanner;

public class IsSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Sorted");
        }else{
            System.out.println("Sorted");
        }
        sc.close();
    }
}
