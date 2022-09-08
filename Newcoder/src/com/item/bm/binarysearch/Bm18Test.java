package com.item.bm.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Bm18Test
 * @createTime 2022年09月08日 14:19:48
 * @Description TODO
 */
public class Bm18Test {

    @Test
    public void find() {

        Bm18 bm18 = new Bm18();

        bm18.Find(5,new int[][]{
                {1,2,8,9},{
                    2,4,9,12
        },{
                    4,7,10,13
        },{
                    6,8,11,15
        }
        });
    }
}