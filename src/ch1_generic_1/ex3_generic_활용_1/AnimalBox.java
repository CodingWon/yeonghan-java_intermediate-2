package ch1_generic_1.ex3_generic_활용_1;

public class AnimalBox <T>{

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}
