class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print(double[] dividendRates) {
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

    private double getDividend(double dividendRate) {
        return getIncome() * dividendRate;
    }

    private double getIncome() {
        return valueOfSupply - getExpense();
    }

    private double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private double getTotal() {
        return valueOfSupply + getVat();
    }

    private double getVat() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingMethodApp {

    public static void main(String[] args) {

        // 배당 비율을 array 에 담는다.
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        // 인스턴스를 이용해 각각
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print(dividendRates);

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 10000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.3;
        a2.print(dividendRates);
    }
}
