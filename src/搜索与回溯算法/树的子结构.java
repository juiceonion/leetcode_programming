package 搜索与回溯算法;

public class 树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        //边界条件判断，如果A和B有一个为空，返回false
        if (A==null||B==null){
            return false;
        }
        //先从根节点判断B是不是A的子结构，如果不是在分别从左右两个子树判断，
        //只要有一个为true，就说明B是A的子结构
        return sameRootDfs(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);


    }


    private boolean sameRootDfs(TreeNode A, TreeNode B){
        //这里如果B为空，说明B已经访问完了，确定是A的子结构
        if(B==null){
            return true;
        }
        //如果B不为空A为空，或者这两个节点值不同，说明B树不是
        //A的子结构，直接返回false
        if (A==null||A.val!=B.val){
            return false;
        }
        //当前节点比较完之后还要继续判断左右子节点
        return sameRootDfs(A.left,B.left)&&sameRootDfs(A.right,B.right);
    }

//    作者：shiinamashiro
//    链接：https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/solution/jian-zhi-offer-26-shu-de-zi-jie-gou-dfs-8eed4/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
