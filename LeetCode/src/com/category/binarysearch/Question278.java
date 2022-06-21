package com.category.binarysearch;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName Question278
 * @createTime 2022年06月21日 09:13:53
 * @Description TODO
 */


public class Question278 implements VersionControl {
    public int firstBadVersion(int n) {

        int left = 0, right = n, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                // 如果true
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    @Override
    public boolean isBadVersion(int version) {
        return version == 4;
    }
}

interface VersionControl {
    boolean isBadVersion(int version);
}