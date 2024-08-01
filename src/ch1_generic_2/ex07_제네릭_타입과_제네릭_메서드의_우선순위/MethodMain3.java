package ch1_generic_2.ex07_제네릭_타입과_제네릭_메서드의_우선순위;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 10);
        Cat cat = new Cat("냐옹이",5);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

    }
}
