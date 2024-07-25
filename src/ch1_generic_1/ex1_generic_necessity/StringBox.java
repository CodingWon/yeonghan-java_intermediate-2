package ch1_generic_1.ex1_generic_necessity;

public class StringBox {

    private String value;


    public StringBox() {
    }

    public StringBox(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
