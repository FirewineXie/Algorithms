package com.basic.example;


import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: Dijkstra_双栈 .java
 * @Create : 2019-02-23-14:04
 * @Description :
 */
public class Dijkstra_双栈 {

    public static void main(String[] args) {

        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();

        while (!StdIn.isEmpty()){
            //读取字符，如果是运算符则压入栈
            String s =  StdIn.readString();
            if (s.equals("C")){

            }else if (s.equals("+")){
                ops.push(s);
            }else if (s.equals("-")){
                ops.push(s);
            }else if (s.equals("*")){
                ops.push(s);
            }else if (s.equals("/")){
                ops.push(s);
            }else if (s.equals("sqrt")){
                ops.push(s);
            }else if (s.equals(")")){
                //如果字符为) 弹出的运算符和操作数，计算结果并压入栈
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")){
                    v = vals.pop() + v;
                }else if (op.equals("+")){
                    v = vals.pop() - v;
                }else if (op.equals("*")){
                    v = vals.pop() * v;
                }else if (op.equals("/")){
                    v = vals.pop() / v;
                }else if (op.equals("sqrt")){
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(s));
            }
            System.out.println(vals.pop());
        }
    }
}
