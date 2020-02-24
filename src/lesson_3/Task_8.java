package lesson_3;

public class Task_8 {
    public static void main(String[] args) {
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*100);
        System.out.println("x: " + x + ", y: " + y);
        while (x < y) {
            x++;
        }
        System.out.println("x: " + x + ", y: " + y);
    }
}
