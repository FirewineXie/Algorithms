package com.category.binarysearch;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1346
 * @createTime 2022年06月30日 08:31:08
 * @Description TODO
 */
public class Question1346 {
    public boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                set.add(arr[i]);
            } else {
                count++;
            }
        }
        if (count > 1) {
            return true;
        }
        for (int a : set) {
            if (set.contains(2 * a)) {
                return true;
            }
        }
        return false;

    }

}
