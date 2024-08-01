package ch1_generic_2.pro03_제네릭_메서드와_와일드카드;

public class UnitPrinter {

    public static <U extends BioUnit> void  printV1(Shuttle<U> u1){
        U unit = u1.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> u1){
        BioUnit unit = u1.out();
        System.out.println("이름 : " + unit.getName() + " , HP : " + unit.getHp());
    }
}
