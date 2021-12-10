package eight.chapter2;

public class Foo {

    public static void main(String[] args) {
        RunSomething runSomething = (number) -> number + 10;

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));

        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));

    }
}
