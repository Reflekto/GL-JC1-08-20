
package lesson_7;

public class Task_1 {

public static class Tech {
    String weight = new String();
    public void setColor(String color) {
        System.out.println("Цвет техники " + color);
    }
}
    static class Kitchen extends Tech {
        static boolean on = false;
        protected void turnOn() {
            on = true;
        }
        protected void turnOff() {
            on = false;
        }
        protected void checkOn(){
            if (on) {
                System.out.println("Техника включена в сеть");
            }
            else {
                System.out.println("Техника отключена от сети");
            }
        }
        }
        interface Switch {
            void switchOn();
            void switchOff();
            void checkSwitch();
        }
        static class Small extends Kitchen implements Switch {
            public Small() {
                Kitchen.on = true;
                weight = "Лёгкий";
            }
            static boolean on = false;
            public void switchOn() {
                if (Kitchen.on) {
                on = true;
                }
                else {
                    System.out.println("Включите прибор в сеть");
                }
            }
            public void switchOff() {
                on = false;
            }
            public void checkSwitch() {
                if (on) {
                    System.out.println("Техника включена");
                }
                else {
                    System.out.println("Техника выключена");
                }
            }
        }

          static class Big extends Kitchen implements Switch {
             public Big() {
             weight = "Тяжёлый";
             }
             static boolean on = false;
             public void switchOn() {
            if (Kitchen.on) {
                on = true;
            }
            else {
                System.out.println("Включите прибор в сеть");
            }
            }
             public void switchOff() {
            on = false;
            }
            public void checkSwitch() {
            if (on) {
                System.out.println("Техника включена");
            }
            else {
                System.out.println("Техника выключена");
            }
          }
        }

        public static void main(String[] args) {
        Small microwave = new Small();
        microwave.setColor("чёрный");
        microwave.checkOn();
        Big freezer = new Big();
        freezer.setColor("белый");
        freezer.turnOff();
        freezer.switchOn();
        freezer.checkSwitch();
}
}
