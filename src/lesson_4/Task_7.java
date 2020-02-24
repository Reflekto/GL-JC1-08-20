package lesson_4;

public class Task_7 {
    public static void main(String[] args) {
        String txt = new String("  Ультразвуковое исследование   позволяет визуализировать желчевыводящие  протоки и сосуды    печени, к которым относятся     печеночные вены, портальная вена    и ее ветви, печеночная   артерия.  ");
        int num = 0;
        char symb;
        char symbl;
        if (txt.charAt(0) != ' ') {
            num++;
        }
        for (int i = 0; i + 1 < txt.length(); i++) {
            symb = txt.charAt(i);
            symbl = txt.charAt(i + 1);
            if (symb == ' ' && symbl != ' ') {
                num = num + 1;
            }
        }
        System.out.printf("Количество слов в тексте равно %d", num);
    }
}
