package lesson_6;

public class Task_2 {

    private int bill20, bill50, bill100;

    private Task_2 (int bill20, int bill50, int bill100){
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    private void add20 (int bill20) {
        this.bill20 += bill20;
    }

    private void add50 (int bill50) {
        this.bill50 += bill50;
    }

    private void add100 (int bill100) {
        this.bill100 += bill100;
    }

    private void allMoney () {
        System.out.println("В банкомате купюр по 100: " + bill100 + ", купюр по 50: " + bill50 + ", купюр по 20: " + bill20);
    }

    private boolean withdraw (int sum) {
        boolean result = true;
        int amount = this.bill20*20 + this.bill50*50 + this.bill100*100;
        if (sum > amount) {
            result = false;
            System.out.println("Операция не удалась, в банкомате недостаточно средств");
        }
        else if (sum < 20) {
            result = false;
            System.out.println("Операция не удалась. Введите большую сумму");
        }
        else if (sum % 20 != 0) {
            if (sum % 50 != 0) {
            result = false;
            System.out.println("Операция не удалась. Введите сумму, кратную 20 или 50");
            }
        }
        else {
            int money = 0;
            int sum100 = 0;
            int sum50 = 0;
            int sum20 = 0;
            while (sum > 0) {
                if (sum >= 100) {
                    if (bill100 < 1) {
                        if (bill50 < 1) {
                            money += 20;
                            sum = sum - 20;
                            bill20 -= 1;
                            sum20 += 1;
                        }
                        else {
                            money += 50;
                            sum = sum - 50;
                            bill50 -= 1;
                            sum50 += 1;
                        }
                    }
                    else {
                    money += 100;
                    sum = sum - 100;
                    bill100 -= 1;
                    sum100 += 1;
                    }
                }
                else if (sum >= 50) {
                    if (bill50 < 1) {
                        if (sum % 20 == 0) {
                            money += 20;
                            sum = sum - 20;
                            bill20 -= 1;
                            sum20 += 1;
                        }
                        else {
                            result = false;
                            System.out.println("Операция не удалась. Введите сумму, кратную 20");
                        }
                    }
                    else {
                    money += 50;
                    sum = sum - 50;
                    bill50 -= 1;
                    sum50 += 1;
                    }
                }
                else if(sum >= 20) {
                    money += 20;
                    sum = sum - 20;
                    bill20 -= 1;
                    sum20 += 1;
                }
                else {
                    result = false;
                    System.out.println("Операция не удалась");
                }
            }
            if (result == true) {
                System.out.println("Операция удалась. Всего обналичено " + money + ", из них купюр по 100 " + sum100 + ", купюр по 50 " + sum50 + ", купюр по 20 " + sum20);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Task_2 one = new Task_2(30, 10, 5);
        one.add20(20);
        one.add50(10);
        one.add100(3);
        one.allMoney();
        one.withdraw(320);
    }
}
