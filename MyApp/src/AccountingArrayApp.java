public class AccountingArrayApp {
    public static void main(String[] args) {
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        // 배열 만들기
        double[] dividendRates = new double[3];

        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double dividend1 = income * dividendRates[0];
        double dividend2 = income * dividendRates[1];
        double dividend3 = income * dividendRates[2];

        // 공급가
        System.out.println("Value of supply : " + valueOfSupply);
        // 부가가치세
        System.out.println("VAT : " + vat);
        // total
        System.out.println("Total : " + valueOfSupply + vat);
        // 비용
        System.out.println("Expense : " + expense);
        // 이익 (공급가 - 비용)
        System.out.println("Income : " + income);
        // 배당
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
    }
}
