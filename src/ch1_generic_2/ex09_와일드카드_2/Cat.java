package ch1_generic_2.ex09_와일드카드_2;


public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
