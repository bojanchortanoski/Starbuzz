public abstract class Beverage {

    String description = "Unknown beverage";
    private BeverageSize size;

    public String getDescription() {
        return description;
    }

    public void setSize(BeverageSize size) {
        this.size = size;
    }

    public BeverageSize getSize() {
        return size;
    }

    public abstract double cost();
}
