package lesson_4;

public class Task_4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
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
        System.out.println();
        int[][] array = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                array[i][j] = arr[i][j];
            }
        }
        System.out.println("90 радусов: ");
        for (int i = 0; i < arr.length; i++) {
            int k = 9;
            for (int j = 0; j < arr[i].length; j++) {
                array[j][i] = arr[i][k];
                k = k - 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] ar = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ar[i][j] = arr[i][j];
            }
        }
        int l = 9;
        System.out.println("180 радусов: ");
        for (int i = 0; i < arr.length; i++) {
            int k = 9;
            for (int j = 0; j < arr[i].length; j++) {
                ar[j][i] = arr[k][l];
                k = k - 1;
            }
            l = l - 1;
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arra = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arra[i][j] = arr[i][j];
            }
        }
        int m = 9;
        System.out.println("270 радусов: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arra[j][i] = arr[m][j];
            }
            m = m - 1;
        }
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                System.out.print(arra[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
