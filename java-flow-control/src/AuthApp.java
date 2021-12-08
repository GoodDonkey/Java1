public class AuthApp {
    public static void main(String[] args) {
        // id와 pass 값을 주면 로그인 텍스트를 출력하는 프로그램
        System.out.println(args[0]);

        String id = "donkey";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("Hi.");

//        if (inputId.equals(id)) {
//            if (inputPass.equals(pass)) {
//                System.out.println("Master!");
//            }
//        } else {
//            System.out.println("who are you?");
//        }

        // 두 조건을 모두 만족하는지 체크: &&
        if (inputId.equals(id) && inputPass.equals(pass)) {
                System.out.println("Master!");
        } else {
            System.out.println("who are you?");
        }
    }
}
