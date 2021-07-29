package com.study.Algorithm.simple;

/**
 * @author XYJ
 * @version 1.0.0
 * @ClassName 对称二叉树_101
 * @createTime: 2021年07月29日 10:18:02
 * @Description TODO
 */
public class 对称二叉树_101 {


    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode p,TreeNode q) {
       if (p == null && q == null){
           return  true;
       }
       if (p == null || q == null){
           return false;
       }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);

    }
}
