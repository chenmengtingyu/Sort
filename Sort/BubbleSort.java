package Sort;

import java.util.Random;

public class BubbleSort {
    Random random = new Random();
    public static int compareCount;
    public static int moveCount;
    public static long startTime;
    public static long endTime;

    public BubbleSort(){
        int[] array = new int[30000];
        for (int i = 0; i < 30000; i++) {
            array[i] = random.nextInt();
        }
        compareCount = 0;
        moveCount = 0;

        startTime = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                compareCount++;
                if (array[j] > array[j + 1]) {
                    moveCount++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        endTime = System.nanoTime();

        System.out.println("比较次数:" + compareCount);
        System.out.println("移动次数:" + moveCount);
        System.out.println("花费时间:" + (endTime - startTime) + "纳秒");
    }
}
