package lesson_4;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10 + 1);
        }
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_ind = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < min) {
                    min = array[j];
                    min_ind = j;
                }
            }
            if(i != min_ind) {
                int tmp = array[i];
                array[i] = array[min_ind];
                array[min_ind] = tmp;
            }
        }
        System.out.println(Arrays.toString(array));
        //или
        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
    }
}
