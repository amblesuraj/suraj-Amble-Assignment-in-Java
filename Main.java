import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

            Node data = insert();
            System.out.println("In order Traversal");
            InOrderTraversal(data);
            System.out.println("\nPre order Traversal");
            preOrderTraversal(data);
            System.out.println("\nPost order Traversal");
            PostOrderTraversal(data);

    }

    private static void PostOrderTraversal(Node node) {
        if(node == null)
            return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.val+"  ");
    }

    private static void InOrderTraversal(Node node) {
        if(node == null)
            return;
        InOrderTraversal(node.left);
        System.out.print(node.val+"  ");
        InOrderTraversal(node.right);
    }

    public static void preOrderTraversal(Node node){
        if(node == null)
            return;
        System.out.print(node.val+"  ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    private static Node insert() {
        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);
        Node forty = new Node(40);
        Node fifty = new Node(50);
        Node sixty = new Node(60);

        ten.left = twenty;
        ten.right = thirty;
        twenty.left=forty;
        twenty.right=sixty;
        thirty.left=fifty;

        return ten;
    }
}
