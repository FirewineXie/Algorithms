package com.study.Algorithm.middle;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 简化路径
 * @Create : 2020/3/2
 * @Description : 71
 */
public class 简化路径 {

    /*
    返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。
    最后一个目录名（如果存在）不能以 / 结尾。此外，规范路径必须是表示绝对路径的
    最短字符串。

    在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；
    此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；
     */

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        //根据/ 划分出来数组
        String[] split = path.split("/");

        // 1. 里面包含的情况 .. // .
        for (int i = 0 ; i < split.length; i++){
            if (!stack.isEmpty() && split[i].equals("..")){
                stack.pop();
            }else if (!split[i].equals("") && !split[i].equals(".") && !split[i].equals("..")){
                stack.push(split[i]);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0 ; i < stack.size();i++){
            stringBuffer.append("/" + stack.get(i));
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {

        简化路径 a = new 简化路径();

        System.out.println(a.simplifyPath("/home//foo/"));
    }
}
