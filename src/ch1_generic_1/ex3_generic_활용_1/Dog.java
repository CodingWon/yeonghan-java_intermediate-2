package ch1_generic_1.ex3_generic_활용_1;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
