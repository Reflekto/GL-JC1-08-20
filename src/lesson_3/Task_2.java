package lesson_3;

public class Task_2 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*10 + 1);
        int b = (int)(Math.random()*10 + 1);
        int r = (int)(Math.random()*10 + 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(r);
        int diag = (int) Math.sqrt(a*a + b*b);
        System.out.println(diag);
        if ((2 * r) >= diag) {
            System.out.println("Можно");
        }
        else {
            System.out.println("Нельзя");
        }
    }
}
