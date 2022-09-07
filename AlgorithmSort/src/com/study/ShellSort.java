package com.study;

/**
 * @author Firewine
 * @version 1.0.0
 * @ClassName ShellSort
 * @createTime 2022年09月07日 15:17:47
 * @Description TODO
 */
public class ShellSort {

    public  void shell_sort(int array[],int lenth){

        int temp = 0;
        int incre = lenth;

        while(true){
            incre = incre/2;

            for(int k = 0;k<incre;k++){    //根据增量分为若干子序列

                for(int i=k+incre;i<lenth;i+=incre){

                    for(int j=i;j>k;j-=incre){
                        if(array[j]<array[j-incre]){
                            temp = array[j-incre];
                            array[j-incre] = array[j];
                            array[j] = temp;
                        }else{
                            break;
                        }
                    }
                }
            }

            if(incre == 1){
                break;
            }
        }
    }
}
