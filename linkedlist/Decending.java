package linkedlist;

// Sort in descending order
// Same input:
// 5
// 40 10 30 20 50


// Expected output:
// [50, 40, 30, 20, 10]

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Decending {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      LinkedList<Integer> list = new LinkedList<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        list.add(z);
      }
      
      Collections.sort(list,Collections.reverseOrder());

      System.out.println(list);
      sc.close();
}
}
