package Tree;

import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
public class dfs {
    static Node buildTree(Scanner sc ){
      int value = sc.nextInt();
      if(value==-1){
        return null;
      }
      Node n = new Node(value);
      n.left = buildTree(sc);
      n.right = buildTree(sc);
      return n;
    }

    static void Dfs(Node node){
      if(node == null){
        return;
      }
      System.out.print(node.data+" ");
      Dfs(node.left);
      Dfs(node.right);
    }
    static void dfsStack(Node node){
      Stack<Node> stack = new Stack<>();
      stack.push(node);
      while(!stack.isEmpty()){
        Node n = stack.pop();
        System.out.print(n.data+" ");

        if(n.right!=null){
          stack.push(n.right);
        }
        if(n.left!=null){
          stack.push(n.left);
        }
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = buildTree(sc);

        System.out.println("Recursion :");
        Dfs(root);
        System.out.println();
        System.out.println("Stack :");
        dfsStack(root);
        // System.out.println("Postorder:");
        // postOrder(root);
        sc.close();
    }
}
