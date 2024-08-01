package ch1_generic_2.ex08_와일드카드_1;

public class Box <T>{

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
