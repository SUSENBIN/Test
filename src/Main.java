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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();//取出栈顶节点
            if (cur != null) {//若节点不为空，按顺序将右、左、中节点添加到栈中
                if (cur.right != null) {//若右节点不为空，添加右节点到栈中
                    stack.push(cur.right);
                }
                if (cur.left != null) {//若左节点不为空，添加左节点到栈中
                    stack.push(cur.left);
                }
                stack.push(cur);//添加中节点到栈中
                stack.push(null);//中节点访问过，但是还没有处理，加入空节点做为标记
            }
            else {//遇到空节点的时候，才将下一个节点放进结果集
                cur = stack.pop();//取出栈顶节点
                result.add(cur.val);
            }
        }
        return result;
    }
}