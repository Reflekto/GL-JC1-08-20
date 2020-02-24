package lesson_3;

public class Task_6 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        System.out.println(x);
        if (x == 1) {
            System.out.println("Число простое");
        } else {
            for (int i = 2; i <= x; i++) {
                if (x % i == 0 && x != i) {
                    System.out.println("Число не простое");
                    break;
                } else if (x == i) {
                    System.out.println("Число простое");
                    break;
                }
            }
        }
    }
}
