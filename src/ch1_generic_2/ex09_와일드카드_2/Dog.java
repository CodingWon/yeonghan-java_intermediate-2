package ch1_generic_2.ex09_와일드카드_2;


public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
