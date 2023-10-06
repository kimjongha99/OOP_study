package abstract_;

public abstract class AbstractClass {
    public void implementMethod() {
        System.out.println("AbstractClass implementation");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}