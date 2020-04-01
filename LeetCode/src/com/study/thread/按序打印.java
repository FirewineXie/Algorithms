package com.study.thread;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @Program Name: 按序打印
 * @Create : 2020/3/2
 * @Description :
 */
public class 按序打印 {

    /*
     *算法

首先初始化共享变量 firstJobDone 和 secondJobDone，初始值表示所有方法未执行。

方法 first() 没有依赖关系，可以直接执行。在方法最后更新变量 firstJobDone 表示该方法执行完成。

方法 second() 中，检查 firstJobDone 的状态。如果未更新则进入等待状态，否则执行方法 second()。在方法末尾，更新变量 secondJobDone 表示方法 second() 执行完成。

方法 third() 中，检查 secondJobDone 的状态。与方法 second() 类似，执行 third() 之前，需要先等待 secondJobDone 的状态。

     */

    static volatile int count = 1;

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            while (count == 1) {
                ;
            }
            System.out.println("result");
        });
        thread.start();
        Thread.sleep(100);
        count++;
        System.out.println(count);
        thread.join();

    }
}

class Foo {


    public Foo() {

    }

    volatile int count = 1;

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        count++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (count != 2) {
            ;
        }
        printSecond.run();
        count++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (count != 3) {
            ;
        }
        printThird.run();
    }
}