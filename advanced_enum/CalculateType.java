package advanced_enum;

import java.util.function.BiFunction;

public enum CalculateType {

    // 람다식을 사용해 calculateType을 캡슐화 시킴 -> calculateCommand는 각각을 알 필요가 없음
    ADD ((num1, num2) -> num1 + num2),
    MINUS ((num1, num2) -> num1 - num2),
    MULTIPLY ((num1, num2) -> num1 * num2),
    DIVIDE ((num1, num2) -> num1 / num2);

    CalculateType(BiFunction<Integer, Integer, Integer> expression) {
        this.expression = expression;
    }

    /**
     * 2개의 인자를 받고 1개의 객체를 리턴하는 함수형 인터페이스
     * */

    private BiFunction<Integer, Integer, Integer> expression;

    public int calculate(int num1, int num2) {
        return this.expression.apply(num1, num2);
    }
}
