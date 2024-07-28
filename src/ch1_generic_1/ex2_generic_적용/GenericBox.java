package ch1_generic_1.ex2_generic_적용;

public class GenericBox <T>{

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
