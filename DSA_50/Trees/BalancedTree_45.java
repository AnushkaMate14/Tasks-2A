package DSA_50.Trees;

public class BalancedTree_45 {

    static int height(TreeNode root) {

        if (root == null)
            return 0;

        int left = height(root.left);

        if (left == -1)
            return -1;

        int right = height(root.right);

        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(height(root) != -1);
    }
}
