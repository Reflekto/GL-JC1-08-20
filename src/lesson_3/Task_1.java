package lesson_3;

public class Task_1 {

    public static void main(String[] args) {
        int x = (int)(Math.random()*100);
        System.out.println(x);
        if (x % 10 == 7) {
            System.out.println("Последняя цифра числа семёрка");
        }
        else {
            System.out.println("Последняя цифра числа не семёрка");
        }
        }
    }
