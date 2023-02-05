package HomeWorkClass18and19;

public class Tester {
    public static void main(String[] args) {
        A taskA=new A();
        taskA.hello="hello";
        taskA.printHello();
        System.out.println("---B----");
        B taskB=new B();
        taskB.hello="Hella";
        taskB.printHello();
        taskB.hi="hi";
        taskB.printHi();
        System.out.println("-----C-------");
        C last=new C();
        last.hello="hello";
        last.printHello();
        last.hi="hii";
        last.printHi();
        last.hiHello();
    }
}
