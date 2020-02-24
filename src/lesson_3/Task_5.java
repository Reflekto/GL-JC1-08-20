package lesson_3;

public class Task_5 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        a = (int)(Math.random()*10 + 2);
        b = (int)(Math.random()*10 + 5);
        c = (int)(Math.random()*10 + 2);
        d = (int)(Math.random()*10 + 5);
        e = (int)(Math.random()*10 + 10);
        f = (int)(Math.random()*10 + 10);
        String pos = "Дома помещаются на данном участке";
        String neg = "Дома не помещаются на данном участке";
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + ", e: " + e + ", f: " + f);

        if ((b < f && d < f && (a + c) < e) || (b < e && d < e && (a + c) < f)) {
            System.out.println(pos);
        }
        else if ((b < f && c < f && (a + d) < e) || (b < e && c < e && (a + d) < f)) {
            System.out.println(pos);
        }
        else if ((a < f && d < f && (b + c) < e) || (a < e && d < e && (b + c) < f)) {
            System.out.println(pos);
        }
        else if ((a < f && c < f && (b + d) < e) || (a < e && c < e && (b + d) < f)) {
            System.out.println(pos);
        }
        else {
            System.out.println(neg);
        }
    }
}
