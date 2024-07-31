package ch1_generic_2.ex01_타입_매개변수_제한1;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1",10);
        Cat cat = new Cat("나옹이1",3);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();
        
        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        Dog biggerDog = dogHospital.older(new Dog("멍멍2",200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
/*
* - 코드 재사용X: 개 병원과 고양이 병원은 중복이 많이 보인다.
  - 타입 안전성O: 타입 안전성이 명확하게 지켜진다
* */
