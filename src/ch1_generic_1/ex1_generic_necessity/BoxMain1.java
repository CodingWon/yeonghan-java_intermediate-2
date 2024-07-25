package ch1_generic_1.ex1_generic_necessity;

/*
*  문제 -
    Double` , `Boolean` 을 포함한 다양한 타입을 담는 박스가 필요하다면 각각의 타입별로 `DoubleBox` ,
    `BooleanBox` 와 같이 클래스를 새로 만들어야 한다.
    @@ 이문제를 어떻게 해결 할 수 있을까?
*
* */
public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);
    }
}
