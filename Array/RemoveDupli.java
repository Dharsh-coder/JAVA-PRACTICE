package Array;

import java.util.Scanner;

public class RemoveDupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int pos=1;
        int lastele = arr[0];
        for(int i=1;i<n;i++){
            if(lastele != arr[i]){
                arr[pos] = arr[i];
                lastele = arr[i];
                pos++;
            }
        }
        for(int i=0;i<pos;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
