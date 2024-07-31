package ch1_generic_2.ex01_타입_매개변수_제한1;

public class CatHospital {
    private Cat animal;

    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 나이 : " + animal.getAge());
        animal.sound();
    }

    public Cat older(Cat target){
        return animal.getAge() > target.getAge() ? animal : target;
    }
}
