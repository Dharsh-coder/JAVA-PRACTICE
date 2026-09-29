package Array;

import java.util.Scanner;

public class Multiplication2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];
        int[][] mul = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<c;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
                
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
