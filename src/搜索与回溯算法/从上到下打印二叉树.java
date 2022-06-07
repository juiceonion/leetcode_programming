package 搜索与回溯算法;

import java.util.ArrayList;

public class 从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        ArrayList<Integer> res = new ArrayList<>();
        
        while (list.isEmpty() != true) {
            int size = list.size();
            TreeNode temp = null;
            for (int i = 0; i < size; i++) {
                temp = list.remove(0);
                res.add(temp.val);
                if (temp.left != null) {
                    list.add(temp.left);
                }
                if (temp.right != null) {
                    list.add(temp.right);
                }
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}