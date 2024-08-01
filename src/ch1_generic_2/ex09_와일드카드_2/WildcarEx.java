package ch1_generic_2.ex09_와일드카드_2;



public class WildcarEx {

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    // box.get()` 을 통해서 꺼낼 수 있는 타입의 최대 부모는 `Animal` 이 된다
    // `Animal` 타입으로 조회할 수 있다
    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

}

