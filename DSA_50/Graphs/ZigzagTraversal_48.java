package DSA_50.Graphs;

import java.util.*;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class ZigzagTraversal_48 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if (leftToRight)
                    level.add(node.data);
                else
                    level.add(0, node.data);

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }

            System.out.println(level);

            leftToRight = !leftToRight;
        }
    }
}
