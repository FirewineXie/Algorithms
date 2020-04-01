package com.study.Algorithm.middle;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 有效括号的嵌套深度
 * @Create : 2020/4/1
 * @Description :
 */
public class 有效括号的嵌套深度 {

    public int[] maxDepthAfterSplit(String seq) {

        if (seq == null || seq.equals("")) {
            return new int[0];
        }
        int depth = 0;
        int[] res = new int[seq.length()];
        //遍历
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);
            if (c == '(') {//入栈,栈内深度增加
                res[i] = ++depth % 2;
            } else {//出栈，栈内深度减少
                res[i] = depth-- % 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        有效括号的嵌套深度 a = new 有效括号的嵌套深度();

        String seq = "()(())()";
        int [] result = a.maxDepthAfterSplit(seq);

        for (int i = 0 ; i< result.length ;i++){
            System.out.printf("%d\t",result[i]);
        }
    }
}
