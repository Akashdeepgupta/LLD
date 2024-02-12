package Design_patterns.structural_design_patterns.Decorator_Flyweight_design_pattern.Decorator;

// normal addon -> will always be added after a base i.e. some form of ice-cream
public class ChocolateScoop implements Icecream {
    private Icecream icecream;

    public ChocolateScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+45;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+" Chocolate Scoop ";
    }
}
