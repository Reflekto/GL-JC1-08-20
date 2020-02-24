package lesson_4;

public class Task_8 {
    public static void main(String[] args) {
        String txt = new String("В проекции ворот, в большинстве случаев, лоцируется селезеночная вена, которая, расходясь на несколько ветвей меньшего диаметра, пронизывает толщу ткани.");
        char symb;
        char symbl;
        for (int i = 0; i + 1 < txt.length(); i++) {
            symb = txt.charAt(i);
            symbl = txt.charAt(i + 1);
            if ((symb != ' ' && symb != ',' && symb != '.' && symb != '?' && symb != '!' && symb != ':' && symb != ';') && (symbl == ' ' || symbl == ',' || symbl == '.' || symbl == '?' || symbl == '!' || symbl == ':' || symbl == ';')) {
                System.out.print(symb);;
            }
        }
    }
}
