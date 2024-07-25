package ch1_generic_1.ex1_generic_necessity;

public class IntegerBox {

    private Integer value;

    public IntegerBox() {
    }

    public IntegerBox(Integer value) {
        this.value = value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
