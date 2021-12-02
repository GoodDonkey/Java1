public class AccountingArrayLoopApp {
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

        // 반복문을 사용하여 배당을 출력함
        // 배당
        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend "+i+" : " + dividendRates[i]);
            i++;
        }
    }
}
