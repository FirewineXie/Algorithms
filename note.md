# 1. 排序

**下面的代码基本都是使用Comparable 接口，使用这个接口实现了主键的抽象，它给出了实现这个接口数据类型的对象的大小顺序的定义。**

**但是，不是每次都要使用这个接口，因为数组元素的主键很可能只是每个元素的一小部分**

## 1. 选择排序

1. 概念：首先找到数组中最小的元素，其次，将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)。其次，在剩下的元素中找到最小的元素，将它和数组的第二个元素交换位置。如此往复，知道将整个数组排序。
2. 在这个算法中，最重要的就是交换和比较，，所有算法的时间效率取决于比较的次数
3. 对于选择排序，鲜明的特点就是 ==运行时间==和==输入无关==。

   ```java
    public static void sort(Comparable[] a){
        //将a 按升序排列
        int N = a.length;
        for (int i = 0; i< N; i++){
            //将a[i] 和 a[i+1,N]中最小的元素进行交换
            int min = i;
             for (int j= i+1; j< N; j++){
                 if (less(a[j],a[min])){
                     min = j;
                 }
                 exch(a,i,min);
             }
        }
   
   ```

## 2. 插入排序

1. 插入排序就是你将每一张牌插入到已经有序的牌中的适当位置
2. 但是在将其余所有元素在插入之前都向右移动一位
3. 与上面的==选择排序 不同==的是， 插入排序所需的时间取决于**输入元素中元素的初始顺序**
4. 所以通过上述的得到：插入排序对应非随机数组的排序，效率会更好

```java

    public static void sort(Comparable[] a){
        //将a[] 按升序排序
        int N = a.length;
        for (int i=1; i < N;i++){
            //将a[i] 插入到a[i-1],a[i-2],a[i-3] ...之中
            for (int j = i; j >0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
```

5. 要大幅度提高插入排序的速度 的方法： 只需要在内循环中将较大的元素都向右移动而不总是交换两个元素(这样访问数组的次数就能减少一半)

```java
  public static void sort2(Comparable[] a){
        //将a[] 按升序排序
        int N = a.length;

        for (int i=1; i < N;i++){
            //将a[i] 插入到a[i-1],a[i-2],a[i-3] ...之中
            Comparable temp = a[i];
            int j = i;
            for (; j>0 && less(temp,a[j-i]);j--){
                a[j] = a[j-1];
            }
            a[j] = temp;
            
        }
    }
```



## 3. 希尔排序

1. 希尔排序是==**基于插入排序**==的快速的排序算法
2. 希尔排序为了加快速度简单的地改进了插入排序，交换不相邻的元素以对数组的局部进行排序，并最终用插入排序将局部有序的数组排序
3.  相当于分组排序

```java
 public static void sort(Comparable[] a){
        int N = a.length;
        int h= 1;

        while (h < N/3){
            h = 3* h + 1;
        }
        while (h >=3){
            for (int i=h;i < N ; i++){
                for (int j =i; j>= h && less(a[i],a[j-h]); j -= h){
                    exch(a,j,j-h);
                }
                h = h/3;
            }
        }
    }
```



## 4. 归并排序

1. 归并排序 ： 可以先将它分成两半分别排序，然后再将结果归并起来，
2. 当然最吸引人的地方是 ： 它能够保证将任意长度为N的数组排序所需时间和<a href="https://www.codecogs.com/eqnedit.php?latex=N\log&space;N" target="_blank"><img src="https://latex.codecogs.com/gif.latex?N\log&space;N" title="N\log N" /></a>成正比，
3. 主要缺点是： 它所需的额外空间和N成正比
4. 归并排序分为==自顶向下==和==自底向上==的两种方法，
5. 在归并排序中利用了高效算法中的分治思想，，，这是其中最典型的例子

```java
//自顶向下
class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo < hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge1(a, lo, mid, hi);
    }


    public static void merge1(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {

            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i < mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[i++];
            }
        }

    }
}
```



```java
//自底向上
class MergeBU {

    private static Comparable[] aux;
    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];

        for (int sz = 1; sz < N;sz = sz+sz){
            for (int i =0; i < N-sz; i += sz+sz){
                merge2(a,i,i+sz-1,Math.min(i+sz+sz-1,N-1));
            }
        }
    }
    public static void merge2(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {

            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i < mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[i++];
            }
        }

    }
}
```



6. 上面这个两个方法，，的临界值是  当数组长度为2的幂时，两种归并所用的比较次数和数组访问次数正好相同，只是顺序不同，
7. 而且自底向上的排序比较适合链表组织的数据



## 5. 快速排序

1. 快速排序是实现简单，使用于各种不同的输入数据且在一般应用中比其他排序算法都要快的多，
2. 快速排序也是一种分治的排序算法，
3. 在快速排序，，，你可以使用很多的辅助的方法，去实行快速排
   1.  原地切分
   2. 别越界
   3. 保持随机性
   4. 终止循环
   5. 处理切分元素值有重复的情况
   6. 终止递归
4. 但是 如果主键是重复的项多的情况下，时间复杂度会是递增的
5. 它将一个数组分成两个子数组，将两部分独立的排序，，==在快速排序中，切分的位置取决于数组的内容==

```java

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);

        sort(a,0,a.length-1);
    }


    private static void sort(Comparable[] a, int lo,int hi){
        if (hi <= lo){
            return;
        }
        int j= partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo , j = hi+1;
        Comparable v = a[lo];
        while (true){
            while (less(a[++i],v)){
                if (i == hi){
                    break;
                }
            }
            while (less(v,a[--j])){
                if (j == lo){
                    break;
                }
            }
            if (i >= j){
                break;
            }
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

```



4. 算法的改进
   1. 切换到插入排序
   2. 三取样切分
   3. 熵最优的排序

```java
// 三向区分的快速排序
class Quick3way{
    private static void sort(Comparable[] a, int lo , int hi){

        if (hi <= lo){
            return;
        }
        int lt = lo,i=lo+1,gt = hi;
        Comparable v = a[lo];
        while (i <= gt){
            int cmp = a[i].compareTo(v);
            if (cmp <0){
                exch(a,lt++,i++);
            }else if (cmp > 0){
                exch(a,i,gt--);
            }else {
                i++;
            }
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }
}

```



## 6. 优先队列

1. 不是每个程序，都需要排序整个数组，或许有那么多只需要查找最大的元素，，在这种的情况下，一个合适的数据结构应该支持 两种操作 ： 删除最大元素和插入元素。
2. 而优先队列最重要的操作就是***删除最大元素***和***插入元素***







### 1. API

1. 泛型优先队列的API -----MaxPQ

2. 关联索引的泛型优先队列的API --- IndexMinPQ

   1. 这个结构  可以能够快速访问其中最小元素的数组，
   2. 它能够快速访问数组的一个特定子集中的最小元素(指所有被插入的元素)



### 2. 堆

#### 1. 堆的定义

1. 数据结构二叉堆能够很好的实现优先队列的基本操作，

2. 在二叉堆的数组中，每个元素都要保证大于等于另两个特定位置的元素

3. **当一颗二叉树的每个结点都大于等于它的两个子结点，可说这个堆有序**

#### 2. 一些特殊的代码实现
1. 基于堆的优先队列

   ```java
   package com.sort.priority.queue;
   
   /**
    * Created by IntelliJ IDEA.
    *
    * @version : 1.0
    * @auther : Firewine
    * @mail ： 1451661318@qq.com
    * @Program Name: MaxPQ .java
    * @Create : 2019-02-25-19:21
    * @Description :  基于堆的优先队列
    */
   public class MaxPQ<key extends Comparable<key>> {
   
       private key[] pq;
       private int N = 0;
   
       public MaxPQ(int maxN){
           pq = (key[]) new Comparable[maxN +1];
       }
       public boolean isEmpty(){
           return N == 0;
       }
       public int size(){
           return N;
       }
       public void insert(key v){
           pq[++N] =v;
           swim(N);
       }
       public key delMax(){
           key max = pq[1];
           exch(1, N--);
           pq[N+1] = null;
           sink(1);
           return max;
       }
       private boolean less(int i,int j){
           return pq[i].compareTo(pq[j] ) < 0;
       }
   
       private void exch(int i,int j){
           key t = pq[i];
           pq[i] = pq[j];
           pq[j] = t;
       }
   
       /**
        * 由下至上的堆有序化
        * @param k
        */
       private void swim(int k){
           while (k>1 && less(k/2,k)){
               exch(k/2,k);
           }
       }
   
       /**
        * 由上之下的堆有序化
        * @param k
        */
       private void sink(int k){
           while (2*k <= N){
               int j = 2*k;
               if (j < N && less(j,j+1)){
                   j++;
               }
               if (!less(k,j)){
                   break;
               }
               exch(k,j);
               k = j;
           }
       }
   }
   
   ```

   

   5. 索引优先队列用例 ---使用优先队列的==多项归并==

      ```java
      package com.sort.priority.queue;
      
      
      import edu.princeton.cs.algs4.In;
      import edu.princeton.cs.algs4.IndexMinPQ;
      import edu.princeton.cs.algs4.StdOut;
      
      /**
       * Created by IntelliJ IDEA.
       *
       * @version : 1.0
       * @auther : Firewine
       * @mail ： 1451661318@qq.com
       * @Program Name: Multiway .java
       * @Create : 2019-02-25-19:35
       * @Description :
       */
      public class Multiway {
      
          public static void merge(In[] streams) {
      
              int N = streams.length;
              IndexMinPQ<String> pq = new IndexMinPQ<>(N);
      
              for (int i = 0; i < N; i++) {
                  if (!streams[i].isEmpty()) {
                      pq.insert(i, streams[i].readString());
                  }
              }
              while (!pq.isEmpty()) {
                  StdOut.println(pq.delMin());
                  int i = pq.delMin();
                  if (!streams[i].isEmpty()) {
                      pq.insert(i, streams[i].readString());
                  }
              }
          }
      
          public static void main(String[] args) {
              
              int N = args.length;
              In[] streams = new In[N];
              for (int i=0;i<N;i++){
                  streams[i] = new In(args[i]);
              }
              merge(streams);
          }
      }
      
      ```

      

# 2. 索引对比框图

## 1.排序

<table>
<thead>
<tr>
<th>ALGORITHM</th>
<th>CODE</th>
<th>IN PLACE</th>
<th>STABLE</th>
<th>BEST</th>
<th>AVERAGE</th>
<th>WORST</th>
<th>REMARKS</th>
</tr>
</thead>
<tbody>
<tr>
<td><strong>选择排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F21elementary%2FSelection.java.html" rel="nofollow noopener noreferrer">Selection.java</a></td>
<td>✔</td>
<td></td>
<td>½ <em>n</em> 2</td>
<td>½ <em>n</em> 2</td>
<td>½ <em>n</em> 2</td>
<td><em>n</em> exchanges; quadratic in best case</td>
</tr>
<tr>
<td><strong>插入排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F21elementary%2FInsertion.java.html" rel="nofollow noopener noreferrer">Insertion.java</a></td>
<td>✔</td>
<td>✔</td>
<td><em>n</em></td>
<td>¼ <em>n</em> 2</td>
<td>½ <em>n</em> 2</td>
<td>use for small or partially-sorted arrays</td>
</tr>
<tr>
<td><strong>冒泡排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F21elementary%2FBubble.java.html" rel="nofollow noopener noreferrer">Bubble.java</a></td>
<td>✔</td>
<td>✔</td>
<td><em>n</em></td>
<td>½ <em>n</em> 2</td>
<td>½ <em>n</em> 2</td>
<td>rarely useful; use insertion sort instead</td>
</tr>
<tr>
<td><strong>希尔排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F21elementary%2FShell.java.html" rel="nofollow noopener noreferrer">Shell.java</a></td>
<td>✔</td>
<td></td>
<td><em>n</em> log3 <em>n</em></td>
<td>unknown</td>
<td>c <em>n</em> 3/2</td>
<td>tight code; subquadratic</td>
</tr>
<tr>
<td><strong>合并排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F22mergesort%2FMerge.java.html" rel="nofollow noopener noreferrer">Merge.java</a></td>
<td></td>
<td>✔</td>
<td>½ <em>n</em> lg <em>n</em></td>
<td><em>n</em> lg <em>n</em></td>
<td><em>n</em> lg <em>n</em></td>
<td><em>n</em> log <em>n</em> guarantee; stable</td>
</tr>
<tr>
<td><strong>快速排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F23quicksort%2FQuick.java.html" rel="nofollow noopener noreferrer">Quick.java</a></td>
<td>✔</td>
<td></td>
<td><em>n</em> lg <em>n</em></td>
<td>2 <em>n</em> ln <em>n</em></td>
<td>½ <em>n</em> 2</td>
<td><em>n</em> log <em>n</em> probabilistic guarantee; fastest in practice</td>
</tr>
<tr>
<td><strong>堆排序</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F24pq%2FHeap.java.html" rel="nofollow noopener noreferrer">Heap.java</a></td>
<td>✔</td>
<td></td>
<td><em>n</em> †</td>
<td>2 <em>n</em> lg <em>n</em></td>
<td>2 <em>n</em> lg <em>n</em></td>
<td><em>n</em> log <em>n</em> guarantee; in place</td>
</tr>
</table>

## 2. 优先队列
 <table>
<thead>
<tr>
<th>DATA STRUCTURE</th>
<th>CODE</th>
<th>INSERT</th>
<th>DEL-MIN</th>
<th>MIN</th>
<th>DEC-KEY</th>
<th>DELETE</th>
<th>MERGE</th>
</tr>
</thead>
<tbody>
<tr>
<td><strong>数组</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F24pq%2FBruteIndexMinPQ.java.html" rel="nofollow noopener noreferrer">BruteIndexMinPQ.java</a></td>
<td>1</td>
<td><em>n</em></td>
<td><em>n</em></td>
<td>1</td>
<td>1</td>
<td><em>n</em></td>
</tr>
<tr>
<td><strong>二叉堆</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F24pq%2FIndexMinPQ.java.html" rel="nofollow noopener noreferrer">IndexMinPQ.java</a></td>
<td>log <em>n</em></td>
<td>log <em>n</em></td>
<td>1</td>
<td>log <em>n</em></td>
<td>log <em>n</em></td>
<td><em>n</em></td>
</tr>
<tr>
<td><strong>d-way heap</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F99misc%2FIndexMultiwayMinPQ.java.html" rel="nofollow noopener noreferrer">IndexMultiwayMinPQ.java</a></td>
<td>log<em>d</em> <em>n</em></td>
<td><em>d</em> log<em>d</em> <em>n</em></td>
<td>1</td>
<td>log<em>d</em> <em>n</em></td>
<td><em>d</em> log<em>d</em> <em>n</em></td>
<td><em>n</em></td>
</tr>
<tr>
<td><strong>二项堆</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F99misc%2FIndexBinomialMinPQ.java.html" rel="nofollow noopener noreferrer">IndexBinomialMinPQ.java</a></td>
<td>1</td>
<td>log <em>n</em></td>
<td>1</td>
<td>log <em>n</em></td>
<td>log <em>n</em></td>
<td>log <em>n</em></td>
</tr>
<tr>
<td><strong>斐波那契堆</strong></td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F99misc%2FIndexFibonacciMinPQ.java.html" rel="nofollow noopener noreferrer">IndexFibonacciMinPQ.java</a></td>
<td>1</td>
<td>log <em>n</em> †</td>
<td>1</td>
<td>1 †</td>
<td>log <em>n</em> †</td>
<td>log <em>n</em></td>
</tr>
</tbody>
</table>
## 3.查找

<table>
<thead>
<tr>
<th>PROBLEM</th>
<th>ALGORITHM</th>
<th>CODE</th>
<th>TIME</th>
<th>SPACE</th>
</tr>
</thead>
<tbody>
<tr>
<td><strong>路径</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F41graph%2FDepthFirstPaths.java.html" rel="nofollow noopener noreferrer">DepthFirstPaths.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>最短路径(最少边缘)</strong></td>
<td>BFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F41graph%2FBreadthFirstPaths.java.html" rel="nofollow noopener noreferrer">BreadthFirstPaths.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>环</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F41graph%2FCycle.java.html" rel="nofollow noopener noreferrer">Cycle.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>有向路径</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FDepthFirstDirectedPaths.java.html" rel="nofollow noopener noreferrer">DepthFirstDirectedPaths.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>最短有向路径 (最少边缘)</strong></td>
<td>BFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FBreadthFirstDirectedPaths.java.html" rel="nofollow noopener noreferrer">BreadthFirstDirectedPaths.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>有向环</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FDirectedCycle.java.html" rel="nofollow noopener noreferrer">DirectedCycle.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>拓扑排序</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FTopological.java.html" rel="nofollow noopener noreferrer">Topological.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>bipartiteness / odd cycle</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F41graph%2FBipartite.java.html" rel="nofollow noopener noreferrer">Bipartite.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>连通分量</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F41graph%2FCC.java.html" rel="nofollow noopener noreferrer">CC.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>强连通分量</strong></td>
<td>Kosaraju–Sharir</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FKosarajuSharirSCC.java.html" rel="nofollow noopener noreferrer">KosarajuSharirSCC.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>强连通分量</strong></td>
<td>Tarjan</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FTarjanSCC.java.html" rel="nofollow noopener noreferrer">TarjanSCC.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>强连通分量</strong></td>
<td>Gabow</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FGabowSCC.java.html" rel="nofollow noopener noreferrer">GabowSCC.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>欧拉回路</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F41graph%2FEulerianCycle.java.html" rel="nofollow noopener noreferrer">EulerianCycle.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>E</em> + <em>V</em></td>
</tr>
<tr>
<td><strong>定向欧拉循环</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FDirectedEulerianCycle.java.html" rel="nofollow noopener noreferrer">DirectedEulerianCycle.java</a></td>
<td><em>E</em> + <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>传递闭包</strong></td>
<td>DFS</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F42digraph%2FTransitiveClosure.java.html" rel="nofollow noopener noreferrer">TransitiveClosure.java</a></td>
<td><em>V</em> (<em>E</em> + <em>V</em>)</td>
<td><em>V</em> 2</td>
</tr>
<tr>
<td><strong>最小生成树</strong></td>
<td>Kruskal</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F43mst%2FKruskalMST.java.html" rel="nofollow noopener noreferrer">KruskalMST.java</a></td>
<td><em>E</em> log <em>E</em></td>
<td><em>E</em> + <em>V</em></td>
</tr>
<tr>
<td><strong>最小生成树</strong></td>
<td>Prim</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F43mst%2FPrimMST.java.html" rel="nofollow noopener noreferrer">PrimMST.java</a></td>
<td><em>E</em> log <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>最小生成树</strong></td>
<td>Boruvka</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F43mst%2FBoruvkaMST.java.html" rel="nofollow noopener noreferrer">BoruvkaMST.java</a></td>
<td><em>E</em> log <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>最短路径(非负权)</strong></td>
<td>Dijkstra</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F44sp%2FDijkstraSP.java.html" rel="nofollow noopener noreferrer">DijkstraSP.java</a></td>
<td><em>E</em> log <em>V</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>最短路径(无负循环)</strong></td>
<td>Bellman–Ford</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F44sp%2FBellmanFordSP.java.html" rel="nofollow noopener noreferrer">BellmanFordSP.java</a></td>
<td><em>V</em> (<em>V</em> + <em>E</em>)</td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>s最短路径（无环）</strong></td>
<td>topological sort</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F44sp%2FAcyclicSP.java.html" rel="nofollow noopener noreferrer">AcyclicSP.java</a></td>
<td><em>V</em> + <em>E</em></td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>所有节点对之间的最短路</strong></td>
<td>Floyd–Warshall</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F44sp%2FFloydWarshall.java.html" rel="nofollow noopener noreferrer">FloydWarshall.java</a></td>
<td><em>V</em> 3</td>
<td><em>V</em> 2</td>
</tr>
<tr>
<td><strong>最大流/最小割</strong></td>
<td>Ford–Fulkerson</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F64maxflow%2FFordFulkerson.java.html" rel="nofollow noopener noreferrer">FordFulkerson.java</a></td>
<td><em>E</em> <em>V</em> (<em>E</em> + <em>V</em>)</td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>二分图匹配</strong></td>
<td>Hopcroft–Karp</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F65reductions%2FHopcroftKarp.java.html" rel="nofollow noopener noreferrer">HopcroftKarp.java</a></td>
<td><em>V</em> ½ (<em>E</em> + <em>V</em>)</td>
<td><em>V</em></td>
</tr>
<tr>
<td><strong>任务分配问题</strong></td>
<td>successive shortest paths</td>
<td><a target="_blank" href="https://link.juejin.im?target=https%3A%2F%2Falgs4.cs.princeton.edu%2F65reductions%2FAssignmentProblem.java.html" rel="nofollow noopener noreferrer">AssignmentProblem.java</a></td>
<td><em>n</em> 3 log <em>n</em></td>
<td><em>n</em> 2</td>
</tr>
</tbody>
</table>




# 工具类

## 1. less ,exch 等方法实现

```java
package com.sort.until;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: Until .java
 * @Create : 2019-02-23-16:56
 * @Description :
 */
public class Until {

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exch(Comparable[] a, int i,int j ){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static boolean isSorted(Comparable[] a){
        for (int i=1; i < a.length; i++){
            if (less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
}

```

