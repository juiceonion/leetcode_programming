package 搜索与回溯算法;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode ptr = queue.remove();
                temp.add(ptr.val);
                if (ptr.left != null) queue.add(ptr.left);
                if (ptr.right != null) queue.add(ptr.right);
            }
            res.add(temp);
        }

        return res;
    }
}
