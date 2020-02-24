package lesson_3;

public class Task_4 {
    public static void main(String[] args) {
        int day = (int)(Math.random()*30+1);
        int month = (int)(Math.random()*11+1);
        int year = (int)(Math.random()*2019+1);
        System.out.println("День " + day);
        System.out.println("Месяц " + month);
        System.out.println("Год " + year);
        int nxtday = day + 1;
        if (nxtday <= 28) {
            System.out.println("Завтра будет " + nxtday + "." + month + "." + year);
        }
        else if (nxtday == 29 && month == 2 && year % 4 != 0) {
            System.out.println("Завтра будет " + 01 + "." + 03 + "." + year);
        }
        else if (nxtday == 30 && month == 2 && year % 4 == 0) {
            System.out.println("Завтра будет " + 01 + "." + 03 + "." + year);
        }
        else if (nxtday == 32 && month == 12) {
            System.out.println("Завтра будет " + 01 + "." + 01 + "." + (year + 1));
        }
        else if (nxtday == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Завтра будет " + 01 + "." + (month + 1) + "." + year);
        }
        else {
            System.out.println("Завтра будет " + 01 + "." + (month + 1) + "." + year);
        }
    }
}
