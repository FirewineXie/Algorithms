package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question744
 * @createTime 2022年06月24日 08:49:18
 * @Description TODO
 */
public class Question744 {

    public char nextGreatestLetter(char[] letters, char target) {

        int length = letters.length;
        if (target >= letters[length - 1]) {
            return letters[0];
        }
        int low = 0, high = length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return letters[low];

    }
}
