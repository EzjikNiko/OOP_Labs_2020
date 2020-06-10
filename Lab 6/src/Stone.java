public class Stone extends CanBePutIntoNecklace {

    private double transparency;

    public Stone(String name, int price, double weight, double transparency) {
        super(name, price, weight);
        this.transparency  = transparency;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }
}