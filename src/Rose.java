public class Rose extends Flowers {
    private double stemLenght;

    public Rose(String name, String color, double stemLenght) {
        super(name, color);
        this.stemLenght = stemLenght;
    }

    public double getStemLenght() {
        return stemLenght;
    }

    @Override
    public void print() {
        System.out.println("Rose: Name - " + getName() + ", Color - " + getColor() + ", StemLenght - " + stemLenght);
    }
}
