package DSA_50.Trees;

import java.util.*;

public class VerticalOrder_46{

    static class Pair {
        TreeNode node;
        int column;

        Pair(TreeNode node, int column) {
            this.node = node;
            this.column = column;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {

            Pair current = queue.poll();

            map.putIfAbsent(current.column, new ArrayList<>());
            map.get(current.column).add(current.node.data);

            if (current.node.left != null)
                queue.add(new Pair(current.node.left, current.column - 1));

            if (current.node.right != null)
                queue.add(new Pair(current.node.right, current.column + 1));
        }

        System.out.println(map.values());
    }
}
