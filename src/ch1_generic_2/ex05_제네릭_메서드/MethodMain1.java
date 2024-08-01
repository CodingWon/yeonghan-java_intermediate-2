package ch1_generic_2.ex05_제네릭_메서드;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.genericMethod(i);
        Integer integerValue = GenericMethod.numberMethod(10);
        Double doubleValue = GenericMethod.numberMethod(20.0);
    }
}
