package com.study.algorithm.middle;

import java.util.*;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question1282
 * @createTime 2022年08月12日 09:15:51
 * @Description TODO
 */
public class Question1282 {


    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> hasp = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> orDefault = hasp.getOrDefault(groupSizes[i], new ArrayList<>());
            orDefault.add(i);
            hasp.put(groupSizes[i], orDefault);
        }

        for (Integer key : hasp.keySet()) {
            if (hasp.get(key).size() == key) {
                result.add(hasp.get(key));
            } else {
                List<Integer> tmp = null;
                if (hasp.get(key).size() % key == 0) {
                    // 那么表示可以切分
                    int i = 0;
                    while (i != hasp.get(key).size()) {
                        tmp = new ArrayList<>();
                       int  length = key + i;
                        for (int j = i; j <length ; j++) {
                            tmp.add(hasp.get(key).get(j));
                            i++;
                        }
                        result.add(tmp);
                        tmp = null;
                    }
                } else {
                    return new ArrayList<>();
                }
            }
        }
        return result;
    }
}
