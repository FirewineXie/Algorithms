package com.study.Getting;

public class SortIntegers {
	public void sortIntegers(int[] A) {
		int temp;
		for(int i = 0;i<=A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i] > A[j]) {
					temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
		for(int i= 0;i<A.length;i++) {
			System.out.print(A[i]+"\t");
		}
	}
	public static void main(String [] args) {
		int [] a= {1,4,2,5,6,3};
		SortIntegers b = new SortIntegers();
		b.sortIntegers(a);
	}
}
