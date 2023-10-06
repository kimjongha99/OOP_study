package abstract_;

public class AbstractCkassExampleMain {

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                // 추상 메서드 바로 사용하는 법
                System.out.println("AbstractClass abstactMethod");
            }
        };
        abstractClass.implementMethod();
        abstractClass.abstractMethod();

        AbstractClass extendedClass = new ExtendedClass();
        extendedClass.implementMethod();
        extendedClass.abstractMethod();
    }

}
