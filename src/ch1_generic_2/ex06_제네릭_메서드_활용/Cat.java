package ch1_generic_2.ex06_제네릭_메서드_활용;


public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
