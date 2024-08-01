package ch1_generic_2.ex08_와일드카드_1;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이",10));

        WildcarEx.printGenericV1(dogBox);
        WildcarEx.printWildcardV1(dogBox);

        WildcarEx.printGenericV2(dogBox);
        WildcarEx.printWildcardV2(dogBox);

        Dog dog = WildcarEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcarEx.printAndReturnWildcard(dogBox);
    }
}
