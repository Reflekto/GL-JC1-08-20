package lesson_3;

public class Task_9 {
    public static void main(String[] args) {
            for (int i = 2; i <= 10000; i++) {
                for (int x = 2; x <= 10000; x++) {
                    if (i % x == 0 && x != i) {
                        break;
                    }
                    else if (i % x == 0 && x == i) {
                        System.out.println(i);
                    }
                }
            }
    }
}

