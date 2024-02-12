package Design_patterns.structural_design_patterns.Decorator_Flyweight_design_pattern.Decorator;


// base-addon -> it can come as base as well as normal on top of topping
public class OrangeCone implements Icecream {
    private Icecream icecream;
    public OrangeCone() {
        // new IceCream is being created
    }

    public OrangeCone(Icecream icecream) {
        // when the cone is being added on top of addons(Icrecream)
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+10;
        }
        else{
            return 10;
        }
    }

    @Override
    public String getDescription() {
        if(icecream != null){
            return icecream.getDescription() + "Orange Cone";
        }
        else {
            return "Orange Cone";
        }
    }
}
