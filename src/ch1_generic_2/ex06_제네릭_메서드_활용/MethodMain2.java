package ch1_generic_2.ex06_제네릭_메서드_활용;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 10);
        Cat cat = new Cat("야옹이" ,5);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 15);
        Dog older = AnimalMethod.getBigger(dog,targetDog);
        System.out.println("older = " + older);
    }
}
