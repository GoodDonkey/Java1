public class AccountingApp {
    public static void main(String[] args) {
        // 공급가
        System.out.println("Value of supply : " + 10000.0);
        // 부가가치세
        System.out.println("VAT : " + (10000.0 * 0.1));
        // total
        System.out.println("Total : " + 10000.0 + (10000.0 * 0.1));
        // 비용
        System.out.println("Expense : " + (10000.0 * 0.3));
        // 이익 (공급가 - 비용)
        System.out.println("Income : " + (10000.0 - 10000.0 * 0.3));
        // 배당
        System.out.println("Dividend : " + (10000.0 - 10000.0 * 0.3) * 0.5);
        System.out.println("Dividend : " + (10000.0 - 10000.0 * 0.3) * 0.3);
        System.out.println("Dividend : " + (10000.0 - 10000.0 * 0.3) * 0.2);
    }
}
