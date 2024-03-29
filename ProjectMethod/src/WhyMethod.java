import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void main(String[] args)  throws IOException {
        printTwoTimes("A", "-");
        printTwoTimes("A", "@");
        printTwoTimes("B", "#");
        printTwoTimes("B", "$");

        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("A", "^"));
        fw.close();
    }

    private static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }
}
