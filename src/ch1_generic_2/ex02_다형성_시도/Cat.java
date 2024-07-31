package ch1_generic_2.ex02_다형성_시도;



public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
