package Design_patterns.structural_design_patterns.Decorator_Flyweight_design_pattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Icecream icecream = new ChocolateChip(
                new ChocolateScoop(
                new OrangeCone(
                new ChocolateSyrup(
                new ChocolateCone()))));
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}
