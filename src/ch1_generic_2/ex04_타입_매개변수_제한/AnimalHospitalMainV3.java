package ch1_generic_2.ex04_타입_매개변수_제한;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1",10);
        Cat cat = new Cat("냐옹이1",3);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 해결 : 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        // 문제2 해결 : 개 타입 반환
        dogHospital.set(dog);
        Dog olderDog = dogHospital.getOlder(new Dog("멍멍이2",200));

        System.out.println("olderDog = " + olderDog );
    }
}
