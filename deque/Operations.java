package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Read n integers and insert them at the rear of a deque. Then perform these operations in order:
// 1. Read x and insert it at the front.
// 2. Read y and insert it at the rear.
// 3. Remove the first element.
// 4. Print the deque.
// 5. Print the first and last elements.
public class Operations {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Deque<Integer> deque = new ArrayDeque<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        deque.addLast(z);
      }
      int x = sc.nextInt();
      deque.addFirst(x);
      int y = sc.nextInt();
      deque.addLast(y);

      deque.removeFirst();
      System.out.println(deque);
      System.out.println(deque.peekFirst());
      System.out.println(deque.peekLast());
      sc.close();
    }
}

// input:
// 3
// 10 20 30
// 5
// 40

// output:
// [10, 20, 30, 40]
// 10
// 40
