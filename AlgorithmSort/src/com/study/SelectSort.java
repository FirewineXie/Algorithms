package com.study;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName SelectSort
 * @createTime 2022年09月07日 14:28:55
 * @Description TODO
 */
public class SelectSort {
    public static void select_sort(int array[],int lenth){

        for(int i=0;i<lenth-1;i++){

            int minIndex = i;
            for(int j=i+1;j<lenth;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
