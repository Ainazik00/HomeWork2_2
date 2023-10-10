public class Peony extends Flowers{
    private int numberOfPetals;

    public Peony(String name, String color, int numberOfPetals) {
        super(name, color);
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    @Override
    public void print() {
        System.out.println("Peony: Name - " + getName() + ", Color - " + getColor() + ", NumberOfPetals - " + getNumberOfPetals());
    }
}
