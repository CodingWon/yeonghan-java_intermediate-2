package ch1_generic_2.ex09_와일드카드_2;

public class Box<T>{

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
