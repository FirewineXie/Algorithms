package com.category.island;

import org.junit.jupiter.api.Test;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question695Test
 * @createTime 2022年07月08日 08:51:04
 * @Description TODO
 */
class Question695Test {

    @Test
    void maxAreaOfIsland() {
        Question695 question695 = new Question695();


        question695.maxAreaOfIsland(new int[][]{
                {
                        0,0,1,0,0,0,0,1,0,0,0,0,0
                },
                {
                        0,0,0,0,0,0,0,1,1,1,0,0,0
                },{
                0,1,1,0,1,0,0,0,0,0,0,0,0
        },{
                0,1,0,0,1,1,0,0,1,0,1,0,0
        },{
                0,1,0,0,1,1,0,0,1,1,1,0,0
        },{
                0,0,0,0,0,0,0,0,0,0,1,0,0
        },{
                0,0,0,0,0,0,0,1,1,1,0,0,0
        },{
                0,0,0,0,0,0,0,1,1,0,0,0,0
        }
        });
    }
}