public abstract class Flowers implements Printable {
    private String name;
    private String color;

    public Flowers(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
