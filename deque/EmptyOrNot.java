package deque;
// Read n integers, push them into an ArrayDeque used as a stack, and print the top element. If the stack is empty, print Empty.
// Sample input:
// 0

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Expected output:
// Empty
public class EmptyOrNot {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Deque<Integer> stack = new ArrayDeque<>();
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int z = sc.nextInt();
        stack.push(z);
      }
      
      if(stack.isEmpty()){
        System.out.println("Empty");
      }else{
        System.out.println(stack.peek());
      }
      sc.close();

    }
}
