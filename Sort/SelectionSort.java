package Sort;

import java.util.Random;

public class SelectionSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;
    public SelectionSort() {
        int[] array = new int[30000];
        for (int i = 0; i < 30000; i++) {
            array[i] = random.nextInt();
        }

        startTime = System.nanoTime();
        compareCount = 0;
        moveCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                compareCount++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            compareCount++;
            if (minIndex != i) {
                moveCount++;
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        endTime = System.nanoTime();

        System.out.println("比较次数:" + compareCount);
        System.out.println("移动次数:" + moveCount);
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
