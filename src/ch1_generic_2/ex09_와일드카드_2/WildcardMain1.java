package ch1_generic_2.ex09_와일드카드_2;



public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이",10));
        catBox.set(new Cat("냐옹이",5));

        WildcarEx.printGenericV2(dogBox);
        WildcarEx.printGenericV2(catBox);

        WildcarEx.printAndReturnWildcard(dogBox);
        WildcarEx.printAndReturnWildcard(catBox);

        Dog dog1 = WildcarEx.printAndReturnGeneric(dogBox);
        // box.get()` 을 통해서 꺼낼 수 있는 타입의 최대 부모는 `Animal` 이 된다
        //  `Animal` 타입으로 조회할 수 있다
        // Dog dog2 =  WildcarEx.printAndReturnWildcard(dogBox);
        Animal animal = WildcarEx.printAndReturnWildcard(dogBox);

    }
}
