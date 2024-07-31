package ch1_generic_2.ex03_제네릭_도입과_실패;

public class AnimalHospitalV2 <T>{

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        // 컴파일 오류 : T의 타입 메서드를 정의하는 시점에는 알 수 없다.
        // System.out.println("동물 이름 : " + animal.getName());
        // animal.sound();

        // Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);
    }

    public T getBigger(T target){
        // 컴파일 오류
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
/*
*  @@ 자바 컴파일러는 어떤 타입이 들어올 지 알 수 없기 때문에
*     `T` 를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인 `Object` 타입으로 가정한다
*
*   =>>> `Object` 가 제공하는 메서드만 호출할 수 있다.
*
*
* */
