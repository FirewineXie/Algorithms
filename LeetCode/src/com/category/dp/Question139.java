package com.category.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question139
 * @createTime 2022年07月04日 09:46:22
 * @Description TODO
 */
public class Question139 {


    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
