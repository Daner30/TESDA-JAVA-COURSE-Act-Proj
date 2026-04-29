package Activities;

abstract class AbstractClass {
    abstract void abstractMethod();

    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

class B extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}

class C extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}

public class Task14 {
    public static void run() {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();

        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
