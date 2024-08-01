package ch1_generic_2.ex07_제네릭_타입과_제네릭_메서드의_우선순위;

/*
*   - 정적 메서드 
*       # 제네릭 메서드만 적용 가능
*
*   - 인스턴스 메서드
*       # 제네릭 타입 가능
*       # 제네릭 메소드 가능
* */
public class ComplexBox <T extends Animal> {        // 제네릭 타입

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public <T> T printAndReturn(T t){               // 제네릭 메서드
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t.className : " + t.getClass().getName());
        return t;
    }
}

    /*
    *   제네릭 타입 보다 제네릭 메서드가 높은 우선순위를 가진다.
    *   인스턴스             : dog
    *   제네릭 메서드 매개변수 : cat
    * */
