package 搜索与回溯算法;

public class 二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirrorTree2(root.left);
        mirrorTree2(root.right);

        return root;
    }
}
