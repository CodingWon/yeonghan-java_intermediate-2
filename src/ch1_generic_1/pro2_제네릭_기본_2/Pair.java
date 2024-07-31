package ch1_generic_1.pro2_제네릭_기본_2;

public class Pair <K,E> {
    private K first;
    private E second;

    public void setFirst(K first){
        this.first =first;
    }

    public void setSecond(E second){
        this.second =second;
    }

    public K getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
