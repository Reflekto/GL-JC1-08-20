package lesson_4;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        float[] array = new float[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (float)(Math.random()*10 + 1);
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            array[i] = Math.round(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
