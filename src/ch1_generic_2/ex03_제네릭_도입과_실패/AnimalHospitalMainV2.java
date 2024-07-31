package ch1_generic_2.ex03_제네릭_도입과_실패;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}

/* 문제점
*   @@ 제네릭 에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
*   @@ 따라서 , 타입 매개변수를 어떤 타입이든 수용할 수 있는 Object로 가정하고, Object 의 기능만 사용할 수 있다.
* */
