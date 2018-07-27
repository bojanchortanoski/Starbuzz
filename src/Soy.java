public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public BeverageSize getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
       double cost = beverage.cost();
       if (getSize() == BeverageSize.TALL)
    }
}
