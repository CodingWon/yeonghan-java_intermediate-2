package ch1_generic_2.pro02_제네릭_타입과_상한;

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
