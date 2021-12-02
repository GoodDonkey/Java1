public class AccountingMethodApp {
    private static double valueOfSupply;
    private static double vatRate;
    private static double expenseRate;

    public static void main(String[] args) {
        valueOfSupply = 10000;
        vatRate = 0.1;
        expenseRate = 0.3;

        // 배당 비율을 array 에 담는다.
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        print(dividendRates);
    }

    private static void print(double[] dividendRates) {
        // 공급가
        System.out.println("Value of supply : " + valueOfSupply);
        // 부가가치세
        System.out.println("VAT : " + getVat());
        // total
        System.out.println("Total : " + getTotal());
        // 비용
        System.out.println("Expense : " + getExpense());
        // 이익 (공급가 - 비용)
        System.out.println("Income : " + getIncome());
        // 배당
        System.out.println("Dividend 1 : " + getDividend(dividendRates[0]));
        System.out.println("Dividend 2 : " + getDividend(dividendRates[1]));
        System.out.println("Dividend 3 : " + getDividend(dividendRates[2]));
    }

    private static double getDividend(double dividendRate) {
        return getIncome() * dividendRate;
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}
