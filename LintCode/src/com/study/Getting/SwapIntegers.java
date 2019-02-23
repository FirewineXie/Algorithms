package com.study.Getting;

public class SwapIntegers {
	public void swapIntegers(int[] A,int index1,int index2) {
		int temp;
		temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
		for(int i = 0;i<A.length;i++) {
			System.out.print(A[i]+"  ");
		}
	}
	public static void main(String [] argv) {
		SwapIntegers a = new SwapIntegers();
		int []A = {1,2,3,4};
		a.swapIntegers(A,2, 3);
	}
}
