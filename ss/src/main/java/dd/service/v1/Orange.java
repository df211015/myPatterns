package dd.service.v1;

public class Orange extends Fruit {
    private String color;

    public Orange(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
