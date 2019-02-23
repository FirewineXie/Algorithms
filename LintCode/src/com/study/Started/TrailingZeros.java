package com.study.Started;

public class TrailingZeros {

	public long num (long  n) {
		long result = 0;
        while(n > 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
	}
	public static void main(String[] args) {
		TrailingZeros a = new TrailingZeros();
		System.out.println(a.num(105));

	}

}

