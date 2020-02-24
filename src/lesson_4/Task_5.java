package lesson_4;

public class Task_5 {
    public static void main(String[] args) {

        int[][] arr = new int[3][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int num = 1;
        int max = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; (j+1) < arr[i].length; j++) {
                if(arr[i][j+1] > arr[i][j]) {
                    num++;
                    if(num > max) {
                        max = max + 1;
                    }
                }
                else {
                    num = 1;
                }
            }
        }
        System.out.printf("Наибольшее число возрастающих элементов матрицы, идущих подряд: %d", max);
    }
}
