package ch1_generic_2.ex04_타입_매개변수_제한;



public class AnimalHospitalV3 <T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 나이 : " + animal.getAge());
        animal.sound();
    }

    public T getOlder(T target){
        return animal.getAge() > target.getAge() ? animal : target;
    }
}
