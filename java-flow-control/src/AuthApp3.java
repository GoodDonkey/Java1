public class AuthApp3 {

    public static void main(String[] args) {

//        String[] users = {"donkey", "horse", "dog"};
        // 2차원 배열로 id, pw 저장하기
        String[][] users = {
                {"donkey", "1111"},
                {"horse", "2222"},
                {"dog", "3333"}
        };

        String inputId = args[0];
        String inputPw = args[1];

        boolean isLogined = false;
        // 반복문으로 아이디와 pw가 맞는지 확인하기
        for (int i=0; i<users.length; i++) {
            String currentId = users[i][0];
            String currentPw = users[i][1];

            if (currentId.equals(inputId) && currentPw.equals(inputPw)) {
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

