import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {

        // PrintWriter 는 파일을 쓰는 클래스. 이를 객체(instance)로 선언하여 사용한다.
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();

        // toString() 메서드 사용하기
        // toString() 은 Object 클래스에 정의되어있으므로 사용할 수 있다.
        System.out.println(p1.toString());

        // 아래와 같이 파일을 만들 때 마다 클래스마다 같은 클래스를 여러번 써야한다. 따라서 객체로 사용하는 것이 좋다.
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result1.txt", "Hello 1");
    }
}
