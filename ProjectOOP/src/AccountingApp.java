class Accounting {
    public static double valueOfSupply;
    public static double vatRate = 0.1;

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingApp {

    public static void main(String[] args) {
        Accounting.valueOfSupply = 10000.0;
        System.out.println(Accounting.valueOfSupply);
        System.out.println(Accounting.getVAT());
        System.out.println(Accounting.getTotal());
    }


}