public class staticMethod {
    public static void main(String[] args) {
        Print.delimiter = "!";
        Print.a();

        System.out.println("-------------------");

        Print bb = new Print();
        bb.b();

        System.out.println("------------------");

        bb.delimiter2 = "@"; // default field에 값을 넣음.
        bb.b();

    }
}

class Print {
    public static String delimiter;
    public String delimiter2;

    public static void a() {
        System.out.println(delimiter);
        System.out.println("a");
    }

    public void b() {
        System.out.println("static = "+delimiter);
        System.out.println("non static = "+delimiter2);
        System.out.println("b");
    }
}
