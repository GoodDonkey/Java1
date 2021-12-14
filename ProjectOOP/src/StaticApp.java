class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod() {
        System.out.println(classVar);
//        System.out.println(instanceVar); // 불가
    }

    public void instanceMethod() {
        System.out.println(classVar);
        System.out.println(instanceVar); // 가능
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);
//        System.out.println(Foo.instanceVar); // static 맥락에서는 사용 불가

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        // 변수 알아보기
        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);

        f1.classVar = "changed by f1"; // classVar 변경 -> f1, f2 모두 적용됨
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);

        // 메서드 알아보기

        Foo.classMethod();
//        Foo.instanceMethod(); // 불가

        f1.instanceMethod();
        f1.classMethod(); // 가능하지만 권장x

        f2.instanceMethod();
        f2.classMethod(); // 가능하지만 권장x
    }
}
