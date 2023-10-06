package interface_;


public class ImplementsClass implements SomeInterface, AnotherInterface {
    @Override
    public void someMethod() {
        System.out.println("Implements some method");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Implements another method");
    }
}