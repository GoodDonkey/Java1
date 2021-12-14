public class MyOOP {
    public static void main(String[] args) {
        // 개별 인스턴스에 delimiter를 다르게 정의하여 일일이 값을 바꿔줄 필요가 없어졌다.

        Print p1 = new Print();
        p1.delimiter = "----";
        p1.printA();
        p1.printA();

        Print p2 = new Print();
        p2.delimiter = "****";
        p2.printB();
        p2.printB();


        p2.printA();
        p1.printA();
        p1.printA();
        p2.printA();
    }
}
