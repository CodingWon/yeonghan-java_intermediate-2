package ch1_generic_2.ex02_다형성_시도;

public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 나이 : " + animal.getAge());
        animal.sound();
    }

    public Animal getOlder(Animal target){
        return animal.getAge() > target.getAge() ? animal : target;
    }
}
