package ch1_generic_2.ex08_와일드카드_1;

public class WildcarEx {

    // 제네릭 메서드
    // Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    // # 와일드 카드
    // - Box<Dog> dogBox 를 전달한다. 와일드카드 ? 는 모든 타입을 받을 수 있다.
    // - Box<Dog>` , `Box<Cat>` 처럼 타입 인자가 정해진 제네릭 타입을 전달 받아서 활용할 때 사용한다
    // - 와일드카드인 `?` 는 모든 타입을 다 받을 수 있다는 뜻이다  ? == < ? extends Object>
    //
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    // 제네릭 메서드
    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // 와일드 카드
    static void printWildcardV2 (Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    // 제네릭 메서드
    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    // 와일드 카드
    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 =" + animal.getName());
        return animal;
    }
}

