package Tree;

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    this.left = null;
  }
}

public class CreatingTree {
  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    

    root.right = new Node(20);
    System.out.println(root.data);
    System.out.println(root.left.data);
    System.out.println(root.right.data);
  }
}
