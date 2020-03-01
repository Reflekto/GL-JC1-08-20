package lesson_6;

public class Task_1 {

    private int sec;
    private int min;
    private int hours;

    private Task_1 (int sec) {
        this.sec = sec;
    }

    private Task_1 (int sec, int min, int hours) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    private int scnds() {
        int scnds = sec + 60*min + 3600*hours;
        System.out.println("Общее количество секунд равно " + scnds);
        return scnds;
    }

    private void compr(Object obj) {
/*      if (this == obj) {
            System.out.println("Объекты равны");
        }
        else {
            System.out.println("Объекты не равны");
        }
*/      if (this.equals(obj)) {
            System.out.println("Объекты равны");
        }
        else {
            System.out.println("Объекты не равны");
        }
    }

    private void compr1(int sec) {
        this.sec = this.sec + 60*this.min + 3600*this.hours;
        if (this.sec == sec) {
            System.out.println("Объекты равны");
        }
        else if (this.sec > sec) {
            System.out.println("Этот объект больше");
        }
        else {
            System.out.println("Этот объект меньше");
        }
    }

    private void out() {
        if (min == 0 && hours == 0) {
        System.out.println("Секунд " + sec);
        }
        else if (hours == 0) {
            System.out.println("Минут " + min +", секунд " + sec);
        }
        else {
            System.out.println("Часов " + hours + ", минут " + min +", секунд " + sec);
        }
    }

    public static void main(String[] args) {
        Task_1 time = new Task_1(210);
        Task_1 time1 = new Task_1(300, 220 , 230);
        time.scnds();
        time.out();
        time.compr(time1);
        time.compr1(time1.sec);

        time1.scnds();
        time1.out();
    }
}
