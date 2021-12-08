public class AuthApp2 {
    public static void main(String[] args) {
        // id와 pass 값을 주면 로그인 텍스트를 출력하는 프로그램
        System.out.println(args[0]);

        String id = "donkey";
        String inputId = args[0];

        String pass = "1111";
        String pass2 = "2222";
        String inputPass = args[1];

        System.out.println("Hi.");

        boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));

        // 두 조건을 모두 만족하는지 체크: &&
        if (inputId.equals(id) && isRightPass) {
                System.out.println("Master!");
        } else {
            System.out.println("who are you?");
        }
    }
}
