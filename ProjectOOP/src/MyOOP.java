public class MyOOP {
    public static void main(String[] args) {
        delimiter = "----";
        printA();
        printA();

        delimiter = "****";
        printB();
        printB();
    }

    public static String delimiter = "";

    private static void printB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    private static void printA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
}
