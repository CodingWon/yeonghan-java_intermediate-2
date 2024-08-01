package ch1_generic_2.ex06_제네릭_메서드_활용;



public class AnimalMethod {

    public static <T extends Animal> void checkup(T t){
        System.out.println("동물 이름 : " + t.getName());
        System.out.println("동물 크기 : " + t.getAge());
        t.sound();
    }

    public static <T extends Animal> T getBigger(T t1, T t2){
        return t1.getAge() > t2.getAge() ? t1 : t2;
    }

}
