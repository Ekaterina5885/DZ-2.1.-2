public class Main<replenishmentAmount> {
    public static void main(String[] args) {
        int balance = 500;
        int replenishmentAmount = 1600;
        int bonus = 100;
        int accruedBonuses = replenishmentAmount / bonus;

        if (replenishmentAmount < 1000) {
            System.out.println("Итоговый счет: " + (balance + replenishmentAmount));

        } else {
            System.out.println("Итоговый счет: " + (balance + replenishmentAmount + accruedBonuses));
        }
    }

}
