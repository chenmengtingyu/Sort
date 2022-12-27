import Sort.*;
import Result.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("\033[31;4m" + "选择操作:" + "\033[0m");   //打印红色字符,方便观看
            System.out.println("1.冒泡排序,2.直接插入排序,3.简单选择排序,4.快速排序,5.希尔排序\n6.归并排序,7.堆排序,8.输出总览(请在以上操作执行完之后再输出总览),9.退出");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> new BubbleSort();

                case 2 -> new InsertionSort();

                case 3 -> new SelectionSort();

                case 4 -> new QuickSort();

                case 5 -> new ShellSort();

                case 6 -> new MergeSort();

                case 7 -> new HeapSort();

                case 8 -> new Result();

                case 9 -> System.exit(0);

                default -> System.out.println("请重新输入!");
            }
        }
    }
}
