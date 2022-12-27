package Result;

import Sort.*;

public class Result {
    public Result() {
        System.out.println("\t\t\t比较次数\t\t移动次数\t\t花费时间\t");
        System.out.printf("冒泡排序\t\t%d\t%d\t%d纳秒\n",BubbleSort.compareCount,BubbleSort.moveCount,BubbleSort.endTime-BubbleSort.startTime);
        System.out.printf("直接插入排序\t%d\t%d\t%d纳秒\n",InsertionSort.compareCount,InsertionSort.moveCount,InsertionSort.endTime-InsertionSort.startTime);
        System.out.printf("简单选择排序\t%d\t%d\t\t%d纳秒\n",SelectionSort.compareCount,SelectionSort.moveCount,SelectionSort.endTime-SelectionSort.startTime);
        System.out.printf("快速排序\t\t%d\t\t%d\t\t%d纳秒\n",QuickSort.compareCount,QuickSort.moveCount,QuickSort.endTime-QuickSort.startTime);
        System.out.printf("希尔排序\t\t%d\t\t%d\t\t%d纳秒\n",ShellSort.compareCount,ShellSort.moveCount,ShellSort.endTime-QuickSort.startTime);
        System.out.printf("归并排序\t\t%d\t\t%d\t\t%d纳秒\n",MergeSort.compareCount,MergeSort.moveCount,MergeSort.endTime-MergeSort.startTime);
        System.out.printf("堆排序\t\t%d\t\t%d\t\t%d纳秒\n",HeapSort.compareCount,HeapSort.moveCount,HeapSort.endTime-HeapSort.startTime);
    }
}
