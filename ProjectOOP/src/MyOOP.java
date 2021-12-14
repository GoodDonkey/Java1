public class MyOOP {
    public static void main(String[] args) {
        Print.delimiter = "----";
        Print.printA();
        Print.printA();

        Print.delimiter = "****";
        Print.printB();
        Print.printB();
    }
}

class Print {
    public static String delimiter = "";

    public static void printB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    public static void printA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
}
