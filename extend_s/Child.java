package extend_s;

public class Child extends Parent {
    public void anotherMethod() {
        System.out.println("child another Method");

        this.parentProtectedInt = 0;
        this.parentPublicInt = 0;
//        this.parentPrivate = 0;  // 부모필드에서 private으로 선언되었기 떄문에 불가능!
    }
}