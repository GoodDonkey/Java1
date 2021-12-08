public class LogicalOperatorApp {
    public static void main(String[] args) {
        System.out.println(1 == 1); // 비교연산자

        // and 연산자
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        // or 연산자
        System.out.println(true || true); // true
        System.out.println(true || false); // false
        System.out.println(false || false); // false

        // not 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true

    }
}
