public class AuthApp3 {

    public static void main(String[] args) {
        String[] users = {"donkey", "horse", "dog"};
        String inputId = args[0];
        boolean isLogined = false;
        // 반복문으로 아이디가 있는지 확인하기
        for (int i=0; i<users.length; i++) {
            String currentId = users[i];
            if (currentId.equals(inputId)) {
                isLogined = true;
                break;
            }
        }
        System.out.println("Hi, ");
        if (isLogined) {
            System.out.println("Master! "+inputId);
        } else {
            System.out.println("Who are you?");
        }
    }
}

