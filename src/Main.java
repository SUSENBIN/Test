import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode(1);
        TreeNode nodeB = new TreeNode();
        TreeNode nodeC = new TreeNode(2);
        TreeNode nodeD = new TreeNode(3);

        nodeA.left = nodeB;
        nodeA.right = nodeC;
        nodeB.right = nodeD;

        System.out.println("Hello world!");
    }
}