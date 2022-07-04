package com.category.dp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question139Test
 * @createTime 2022年07月04日 09:54:38
 * @Description TODO
 */
class Question139Test {

    @Test
    void wordBreak() {


        Question139 question139 = new Question139();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("aaaa");
        strings.add("aaa");



        boolean applepenapple = question139.wordBreak("aaaaaaa", strings);
        System.out.println(applepenapple);
    }
}