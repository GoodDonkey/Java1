public class ArrayApp {

    public static void main(String[] args) {

        String[] users = new String[3];

        users[0] = "egoing";
        users[1] = "donkey";
        users[2] = "horse";

        System.out.println(users[1]); // 1번 인덱스의 원소 프린트
        System.out.println(users.length); // 원소 개수

        // 만들 때 값도 넣기
        int[] scores = {10, 100, 1000};

        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}
