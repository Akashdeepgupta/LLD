package Design_patterns.structural_design_patterns.Decorator_Flyweight_design_pattern.Decorator;


// base-addon -> it can come as base as well as normal on top of topping
public class ChocolateCone implements Icecream {
    private Icecream icecream;
    public ChocolateCone() {
        // new IceCream is being created
    }

    public ChocolateCone(Icecream icecream) {
        // when the cone is being added on top of addons(Icrecream)
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+20;
        }
        else{
            return 20;
        }
    }

    @Override
    public String getDescription() {
        if(icecream != null){
            return icecream.getDescription() + "chocolate Cone";
        }
        else {
            return "Chocolate Cone";
        }
    }
}
