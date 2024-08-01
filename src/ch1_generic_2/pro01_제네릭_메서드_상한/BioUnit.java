package ch1_generic_2.pro01_제네릭_메서드_상한;

public class BioUnit {

    private String name;
    private int hp;

    public BioUnit(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
