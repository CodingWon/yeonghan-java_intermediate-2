package ch1_generic_2.ex05_제네릭_메서드;

public class GenericMethod {

    public static Object objectMethod(Object obj){
        System.out.println("object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic print : " + t);
        return t;
    }

    public static <T extends  Number> T numberMethod(T t){
        System.out.println("bound pring " + t);
        return t;
    }
}

/*
*   - 제네릭 타입은 객체를 생성하는 시점에 타입이 결정된다.
*   - static 메서드는 인스턴트 단위가 아니라 클래스 단위로 작동하여 제네릭과 무관하다
*   - static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야한다.
* */
