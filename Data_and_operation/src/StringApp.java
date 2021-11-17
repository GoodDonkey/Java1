public class StringApp {

    public static void main(String[] args) {
        // Character VS String
        System.out.println("Hello World"); // String -> 문자열
        System.out.println('H'); // Character 한 글자를 의미. -> 문자

        System.out.println("Hello" + // 코드 작성 중 줄바꿈을 하려면 + 를 쓰고 바꾸면 됨.
                "World");
        // new line
        System.out.println("Hello\n World"); // 출력시 줄바꿈

        System.out.println("Hello \"world\" "); // 따옴표 같은 특수한 문자를 escape 시키기
    }
}
