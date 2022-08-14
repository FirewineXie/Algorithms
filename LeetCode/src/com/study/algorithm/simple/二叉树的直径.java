package com.study.algorithm.simple;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 二叉树的直径
 * @Create : 2020/3/10
 * @Description :
 */
public class 二叉树的直径 {

    /**
     * 深度优先遍历
     *
     * @param root
     * @return
     */
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    // 函数dfs的作用是：找到以root为根节点的二叉树的最大深度
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = dfs(root.left);
        int rigthDepth = dfs(root.right);
        res = Math.max(res,leftDepth + rigthDepth);
        return Math.max(leftDepth,rigthDepth) + 1;
    }

    public static void main(String[] args) {

        二叉树的直径 a = new 二叉树的直径();
        TreeNode b = new TreeNode(3);
        b.left = new TreeNode(1);

        b.left.left = new TreeNode(2);
       b.left.right = new TreeNode(5);
       b.right = new TreeNode(6);

        System.out.println(a.diameterOfBinaryTree(b));
    }
}
