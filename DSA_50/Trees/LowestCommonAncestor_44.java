package DSA_50.Trees;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class LowestCommonAncestor_44 {

    static TreeNode lca(TreeNode root, int a, int b) {

        if (root == null)
            return null;

        if (root.data == a || root.data == b)
            return root;

        TreeNode left = lca(root.left, a, b);
        TreeNode right = lca(root.right, a, b);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode result = lca(root, 4, 5);

        System.out.println(result.data);
    }
}