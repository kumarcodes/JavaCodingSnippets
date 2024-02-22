package javacodes;

abstract class MyClass {
    public static void methodStatic() {
        System.out.println("Static Method Invoked");
    }

    public abstract void methodAbstract();

    void methodDefault() {
        System.out.println("Default Method Invoked");
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass() {
            @Override
            public void methodAbstract() {
                System.out.println("Abstract Method Invoked");
            }
        };
        obj.methodDefault();
        MyClass.methodStatic();
        obj.methodAbstract();
    }

}
