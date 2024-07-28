package ch1_generic_1.ex2_generic_적용;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");

        GenericBox<Integer> integerBox = new GenericBox<>();        // 생성 시점에 T의 타입의 결정
        integerBox.set(1);
        //integerBox.set("문자100") // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); 

    }
}
