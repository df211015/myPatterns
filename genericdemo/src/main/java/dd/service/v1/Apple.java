package dd.service.v1;

public class Apple extends Fruit {
    private String color;

    public Apple(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
