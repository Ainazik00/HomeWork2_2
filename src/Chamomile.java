public class Chamomile extends Flowers {
    private boolean hasPollen;

    public Chamomile(String name, String color, boolean hasPollen) {
        super(name, color);
        this.hasPollen = hasPollen;
    }


    public boolean isHasPollen() {
        return hasPollen;
    }


    @Override
    public void print() {
        System.out.println("Chamomile: Name - " + getName() + ", Color - " + getColor() + ", HasPollen - " + hasPollen);
    }
}
