package com.study.Algorithm.simple;

/**
 * @version : 1.0
 * @auther : Firewine
 * @Program Name: 检测大写字母
 * @Create : 2020/2/19
 * @Description :
 * <p>
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * <p>
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/detect-capital
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 检测大写字母 {

    public boolean detectCapitalUse(String word) {


        // 正则表达式，是最好费时间的，所以尽量不可取
        String firstword = word.substring(0, 1);
        String secondword = word.substring(1);
        //1. 第一种方法，用正则表达式
        //判断首字母是否包含大写字母
        if (firstword.matches(".*[A-Z]+.*")) {
            //判断其他是否包含大写字母
            if (secondword.matches(".*[A-Z]+.*")) {
                //判断其他是否包含小写字母
                if (secondword.matches(".*[a-z]+.*")) {
                    return false;
                } else {
                    //这里返回USA 全是大写的
                    return true;
                }
            }else {
                // 返回 首字母大写的LeetCode
                return true;
            }
        } else {
            //首字母不是大写
            if (secondword.length() == 0) {
                return true;

            }else {
                if (secondword.matches(".*[A-Z]+.*")) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }
    public boolean detectCapitalUse1(String word) {
        //2. 第二种方法,

        //判断是否全是小写
        if ( word.compareTo(word.toLowerCase()) == 0){
            return true;
        }else  if ( word.compareTo(word.toUpperCase()) == 0){
            return true;
        }else if (  word.substring(0,1).compareTo(word.substring(0,1).toUpperCase()) == 0){

            if (  word.substring(1).compareTo(word.substring(1).toLowerCase()) == 0) {
              return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

        检测大写字母 a = new 检测大写字母();
        System.out.println(a.detectCapitalUse1("FlaG"));
    }
}
