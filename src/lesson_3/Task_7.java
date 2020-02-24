package lesson_3;

public class Task_7 {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 1000000000);
        System.out.println(x);
        int z = 1;
        int a = x;
        while (a >= 10) {
            a = a / 10;
            z++;
        }
        int m = 1;
        if (z < 7 && z > 3) {
            m = 1000;
        } else if (z >= 7 && z <= 9) {
            m = 1000000;
        } else if (z <= 3) {
            m = 1;
        }
        for (int y = 0; m >= 1000; m /= 1000) {
            if (((x / m) - y) < 10) {
                System.out.print("00" + ((x / m) - y) + " ");
            }
            else if (((x / m) - y) < 100) {
                System.out.print("0" + ((x / m) - y) + " ");
            }
            else {
                System.out.print((x / m) - y + " ");
            }
            y += (x / m) * 1000;
        }
        if (x % 1000 < 10) {
            System.out.println("00" + x % 1000);
        } else if (x % 1000 < 100) {
            System.out.println("0" + x % 1000);
        }
        else {
            System.out.println(x % 1000);
        }
    }
}
