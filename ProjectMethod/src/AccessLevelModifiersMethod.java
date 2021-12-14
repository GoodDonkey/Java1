public class AccessLevelModifiersMethod {
    public static void main(String[] args) {
        hi();
        Greeting.hi2();
    }

    private static void hi() {
        System.out.println("Hi");
    }
}

class Greeting {
    public static void hi2() {
        System.out.println("Hi2");
    }
}
