package com.study.algorithm.middle;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : Firewine
 * @version : 1.0
 * @ProgramName: 单词的压缩编码
 * @Create : 2020/3/28
 * @Description :
 */
public class 单词的压缩编码 {

    public int minimumLengthEncoding(String[] words) {

        int len = 0;
        Trie trie = new Trie();
        // 先对单词列表根据单词长度由长到短排序
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        // 单词插入trie，返回该单词增加的编码长度
        for (String word: words) {
            len += trie.insert(word);
        }
        return len;
    }

    public static void main(String[] args) {


        单词的压缩编码 a = new 单词的压缩编码();


        a.minimumLengthEncoding(new String[]{"time", "me", "bell"});


    }
}
// 定义tire
class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public int insert(String word) {
        TrieNode cur = root;
        boolean isNew = false;
        // 倒着插入单词
        for (int i = word.length() - 1; i >= 0; i--) {
            int c = word.charAt(i) - 'a';
            if (cur.children[c] == null) {
                isNew = true; // 是新单词
                cur.children[c] = new TrieNode();
            }
            cur = cur.children[c];
        }
        // 如果是新单词的话编码长度增加新单词的长度+1，否则不变。
        return isNew? word.length() + 1: 0;
    }
}

class TrieNode {
    char val;
    TrieNode[] children = new TrieNode[26];

    public TrieNode() {}
}