public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
        setSize(BeverageSize.SMALL);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
