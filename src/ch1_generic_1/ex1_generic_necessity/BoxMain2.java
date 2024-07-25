package ch1_generic_1.ex1_generic_necessity;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();

        integerBox.setValue(10);

        // Integer = Object ** 자식은 부모를 담을 수 없다. 다운 캐스팅 필요
        Integer integer = (Integer) integerBox.getValue();

        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        // String = Object ** 자식은 부모를 담을 수 없다. 다운 캐스팅 필요
        String str = (String) stringBox.getValue();

        System.out.println("String = " + str);
        
        // 잘못된 타임의 인수 전달시 - 예외 발생 ClassCastException
        // String to Integer error
        integerBox.setValue("문자100");
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);

        /*
        *   문제점
        *   1) 실수로 원하지 않은 타입이 들어 갈 수 있다.
        *   2) 반환 타입이 일치하지 않는다.
        *  @@ 타입 안정성이 떨어진다 !!!!
        *
        * */
    }
}
