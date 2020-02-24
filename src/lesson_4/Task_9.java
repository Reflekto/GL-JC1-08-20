package lesson_4;

public class Task_9 {
    public static void main(String[] args) {
        String txt = new String("Карл у Клары украл кораллы ");
        String txtcp = new String(txt);
        StringBuilder txtbldr = new StringBuilder(txt);
        int i = 0;
        while (i < 10) {
            txt = txt + txtcp;
            i++;
        }
        System.out.println(txt);
        int j = 0;
        while (j < 10) {
            txtbldr.append(txtcp);
            j++;
        }
        System.out.println(txtbldr);
    }
}
