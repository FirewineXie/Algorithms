package com.study.Algorithm.simple;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 相同的树
 * @Create : 2020/3/7
 * @Description :
 */
public class 相同的树 {

    /**
     *  可以看到，层次遍历可以满足这个问题
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> p1 ;
        List<Integer> q1 ;
        p1 = levelOrder(p);
        q1 = levelOrder(q);


        return  p1.equals(q1);
    }

    private List<Integer> levelOrder(TreeNode root) {
        List<Integer> result  = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null){
            return result;
        }
        q.add(root);

        while (!q.isEmpty()){
            TreeNode cur = q.remove();
            result.add(cur.val);

            if (cur.left != null){
                q.add(cur.left);
            }

            if (cur.right != null){
                q.add(cur.right);
            }
            if (cur.right != null && cur.left == null){
                result.add(-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        相同的树 a = new 相同的树();
        TreeNode b1 = new TreeNode(1);
        b1.left = new TreeNode(3);

        TreeNode b2 = new TreeNode(1);


        b2.right = new TreeNode(3);
        System.out.println(a.isSameTree(null, null));
    }
}
