public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int gift = bonus;
        int total = replenishment + gift + balance;

        System.out.println("Сумма бонусов: " + gift + " рублей");
        System.out.println("Итого на счету: " + total + " рублей");
    }
}