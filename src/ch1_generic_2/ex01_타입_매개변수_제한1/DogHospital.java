package ch1_generic_2.ex01_타입_매개변수_제한1;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 나이 : " + animal.getAge());
        animal.sound();
    }

    public Dog older(Dog target){
        return animal.getAge() > target.getAge() ? animal : target;
    }
}
