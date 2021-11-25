public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1; // 자동으로 double 형태로 바꾸어 저장된다.
        System.out.println(b);

//        int c = 1.1; // double을 int로 바꾸면 손실이 있기 때문에 자동으로 형변환이 이루어지지 않는다.
        double d = 1.1;
        int e = (int) 1.1;

        System.out.println(d);
        System.out.println(e);

        // 1을 String 으로 casting
        String f = Integer.toString(1);
        System.out.println(f);
        System.out.println(f.getClass());

        // float를 String으로 casting
        String g = Float.toString(1.1f);
        System.out.println(g);

        // String을 double로 casting
        double h = Double.parseDouble("1.2");
        System.out.println(h);
    }
}
