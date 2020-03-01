package lesson_7;

public class Task_2 {

    interface Info {
        void size();
        void placeOfUse();
        void whoseMoney();
    }

    static class BankCard implements Info {
        String size;
        String placeOfUse;
        String whoseMoney;

        @Override
        public void size() {
            if (size == null) {
                System.out.println("Размер карты: любая");
            } else {
                System.out.println("Размер карты: " + size);
            }
        }

        @Override
        public void placeOfUse() {
            System.out.println("Регион использования: " + placeOfUse);
        }

        @Override
        public void whoseMoney() {
            if (whoseMoney == null) {
                System.out.println("Принадлежность средств: неизвестна");
            } else {
                System.out.println("Принадлежность средств: " + whoseMoney);
            }
        }
    }
    static class ClassicCard extends BankCard {
        public ClassicCard () {
            size = "Тонкая";
        }
    }

    static class VirtualCard extends BankCard {
        public VirtualCard() {
            size = "Виртуальная";
        }
    }

    static class LocalCard extends ClassicCard {
        public LocalCard() {
            placeOfUse = "Для использования внутри страны";
        }
    }

    static class InternCard extends BankCard {
        public InternCard() {
            placeOfUse = "Для международного использования";
        }
        String paySistem;
    }

     static class DebitCard extends BankCard {
        public DebitCard() {
            whoseMoney = "На карте мои средства";
        }
     }

     static class CreditCard extends BankCard {
         public CreditCard() {
             whoseMoney = "На карте средства банка";
         }
     }

     static class Visa extends InternCard {
       public Visa () {
           paySistem = "Visa";
       }
     }
    static class MasterCard extends InternCard {
        public MasterCard () {
            paySistem = "MasterCard";
        }
    }

    public static void main(String[] args) {
        Visa visaPlatinum = new Visa();
        visaPlatinum.size();
        visaPlatinum.placeOfUse();
        visaPlatinum.whoseMoney();
    }
}
