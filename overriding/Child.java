package overriding;

public class Child extends Parent {
    @Override       // 부모클래스에서 상속받은 메서드가 사라져 오버라이딩이 불가능한 경우 에러가 뜸 (명시적으로 나타내주는 역할을 한다)
    public void someMethod() {
        System.out.println("child someMethod");

    }
}