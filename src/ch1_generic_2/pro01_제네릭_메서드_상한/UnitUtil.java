package ch1_generic_2.pro01_제네릭_메서드_상한;

public class UnitUtil {

    public static <U extends BioUnit> U maxHp (U u1 , U u2){
        return  u1.getHp() > u2.getHp() ? u1 : u2;
    }
}
