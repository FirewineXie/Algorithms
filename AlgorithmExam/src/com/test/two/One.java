package com.test.two;


import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: One
 * @Create : 2020/3/3
 * @Description :
 */
 /*
       解题思路：通过中序遍历二叉搜索树，找到第k大的节点的值temp，然后通过层次遍历二叉搜索树，找到值为
       temp的节点，并且返回该节点
       注意考虑：1 二叉搜索树为空，或者k为0则直接返回null；
               2 k的值大于二叉搜索树的节点个数，则返回null
       */
public class One {

    public static void main(String[] args) {
        One demo = new One();
        BinaryTreeNode root = new BinaryTreeNode(5);
        BinaryTreeNode a = new BinaryTreeNode(3);
        BinaryTreeNode b = new BinaryTreeNode(7);
        BinaryTreeNode c = new BinaryTreeNode(2);
        BinaryTreeNode d = new BinaryTreeNode(4);
        BinaryTreeNode e = new BinaryTreeNode(6);
        BinaryTreeNode f = new BinaryTreeNode(8);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        BinaryTreeNode k = KthNode(root, 3);
        System.out.println(k.val);
    }

    static int index = 0;

    static BinaryTreeNode KthNode(BinaryTreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) {
            return null;
        }
        return getKthNode(pRoot, k);
    }

    private static BinaryTreeNode getKthNode(BinaryTreeNode pRoot, int k) {
        BinaryTreeNode KthNode = null;
        if (pRoot.left != null)//如果该节点有左孩子，就一直递归到左叶子节点
        {
            KthNode = getKthNode(pRoot.left, k);
        }
        if (KthNode == null) {
            index++;  //中序遍历的计数
            if (k == index) {
                KthNode = pRoot;
            }
        }

        if (KthNode == null && pRoot.right != null)
        //如果该节点有右孩子，就递归到右孩子
        {
            KthNode = getKthNode(pRoot.right, k);
        }

        return KthNode;

    }

    BinaryTreeNode KthNode1(BinaryTreeNode root, int k){
        if(root==null||k==0) {
            return null;
        }
        int count=0;
        Stack<BinaryTreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root=stack.pop();
            count++;
            if(count==k) {
                return root;
            }
            root=root.right;
        }
        return null;
    }

}

class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int val) {
        this.val = val;
    }

}