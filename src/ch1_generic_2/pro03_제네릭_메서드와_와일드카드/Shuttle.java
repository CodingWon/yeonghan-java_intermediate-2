package ch1_generic_2.pro03_제네릭_메서드와_와일드카드;



public class Shuttle<U extends BioUnit> {
    private U unit;

    public void in (U unit){
        this.unit = unit;
    }

    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());

    }

    public U out (){
        return unit;
    }

}
