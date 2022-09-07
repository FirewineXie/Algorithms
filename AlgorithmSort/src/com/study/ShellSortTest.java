package com.study;


import org.junit.Test;


/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName ShellSortTest
 * @createTime 2022年09月07日 15:32:39
 * @Description TODO
 */
public class ShellSortTest {

    @Test
    public void shell_sort() {
        ShellSort shellSort = new ShellSort();


        shellSort.shell_sort(new int[]{59, 20, 17, 13, 28, 14, 23, 83}, 8);
    }
}