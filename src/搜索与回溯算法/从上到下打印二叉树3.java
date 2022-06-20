package 搜索与回溯算法;

import java.util.*;

public class 从上到下打印二叉树3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;

        boolean flag = true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Deque<Integer> deque = new LinkedList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

                if (flag) {
                    deque.offerLast(node.val);
                } else {
                    deque.offerFirst(node.val);
                }
            }
            res.add(new ArrayList<>(deque));
            flag = !flag;
        }

        return res;
    }
}
