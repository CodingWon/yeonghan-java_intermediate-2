package ch1_generic_2.ex07_제네릭_타입과_제네릭_메서드의_우선순위;


public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
