public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1400;

        int x;
        if (replenishment > 1000) {
            x = replenishment / 100;
        } else {
            x = 0;
        }

        int bonus = x;
        int total = replenishment + x + balance;

        System.out.println("Сумма бонусов: " + bonus + " рублей");
        System.out.println("Итого на счету: " + total + " рублей");
    }
}