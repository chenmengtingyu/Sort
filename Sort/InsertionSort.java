package Sort;

import java.util.Random;

public class InsertionSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;
    public InsertionSort() {
        int[] array = new int[30000];
        for (int i = 0; i < 30000; i++) {
            array[i] = random.nextInt();
        }

        startTime = System.nanoTime();
        compareCount = 0;
        moveCount = 0;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                compareCount++;
                moveCount++;
                array[j + 1] = array[j];
                j--;
            }
            compareCount++;
            moveCount++;
            array[j + 1] = current;
        }
        endTime = System.nanoTime();

        System.out.println("比较次数:" + compareCount);
        System.out.println("移动次数:" + moveCount);
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
