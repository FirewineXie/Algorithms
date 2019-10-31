# 第五章 ： 字符串

## 1. 字母表

1. 字母表的API= alphabet
    1. 可以实现多种内置的字母表，例如： Alphabet.UNICODE16
    ```java
     public class Count {
            public static void main(String[] args) {
    
    
                Alphabet alpha = new Alphabet(args[0]);
                int R = alpha.R();
                int[] count = new int[R];
    
                String s = StdIn.readAll();
                int N = s.length();
                for (int i = 0; i < N; i++) {
                    if (alpha.contains(s.charAt(i))) {
                        count[alpha.toIndex(s.charAt(i))]++;
                    }
                }
                for (int c = 0; c < R; c++) {
                    StdOut.println(alpha.toChar(c) + " " + count[c]);
                }
            }
        }
    ```
2. 使用alphabet类的一个最重要的原因是字符索引的数组能够提高算法的效率
3. **但是 ： 大多数程序 使用的都是 String 类型，并且字符串 和 索引的相互转化 会大幅度降低实现的性能，**
## 2. 字符串排序

### 第一类 ： 从右到左检查键中的字符 ，（低位优先LSD）
1. 如果将一个字符串看作一个256 进制的数组，那么从右到左检查字符串就等于先检查数字的最低位。
2. 最适合==键长度都相同的字符串排序应用==

### 第二类 ： 从左到右检查键中的字符 ， （高位优先）
1. 不需要检查所有的输入就能够完成排序，类似快排
2. 但是与快排不一样的是
    1. 高位优先的字符串排序算法在切分时仅使用键的第一个字符，而快速排序是使用所有
    