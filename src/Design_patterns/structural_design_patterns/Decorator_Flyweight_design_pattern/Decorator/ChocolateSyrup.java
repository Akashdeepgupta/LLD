package Design_patterns.structural_design_patterns.Decorator_Flyweight_design_pattern.Decorator;

//// normal addon -> will always be added after a base i.e. some form of ice-cream
public class ChocolateSyrup implements Icecream {
    private Icecream icecream;

    public ChocolateSyrup(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+15;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" chocolate syrup ";
    }
}
