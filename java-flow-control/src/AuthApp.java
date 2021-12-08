public class AuthApp {
    public static void main(String[] args) {
        // donkey 라는 값을 주면 로그인 텍스트를 출력하는 프로그램
        System.out.println(args[0]);

        String id = "donkey";
        String inputId = args[0];

        System.out.println("Hi.");

        if (inputId.equals(id)) {
            System.out.println("Master!");
        } else {
            System.out.println("who are you?");
        }
    }
}
