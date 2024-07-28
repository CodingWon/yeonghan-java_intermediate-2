package ch1_generic_1.ex3_generic_활용_1;

public class AnimalMain {
    public static void main(String[] args) {
       ;
        AnimalBox<Dog> dogAnimalBox = new AnimalBox<>();
        dogAnimalBox.setAnimal(new Dog("누렁이",5));
        Dog 누렁이 = dogAnimalBox.getAnimal();
        누렁이.sound();
        System.out.println(누렁이.toString());


        AnimalBox<Animal> animalAnimalBox = new AnimalBox<>();
        animalAnimalBox.setAnimal(new Cat("치즈냥",10));
        Animal 치즈냥 = animalAnimalBox.getAnimal();
        치즈냥.sound();
        System.out.println(치즈냥.toString());


    }
}
