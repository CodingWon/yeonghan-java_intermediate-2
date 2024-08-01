package ch1_generic_2.pro02_제네릭_타입과_상한;

public class Shuttle <U extends BioUnit> {
    private U unit;

    public void in (U unit){
        this.unit = unit;
    }

    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());

    }

}
