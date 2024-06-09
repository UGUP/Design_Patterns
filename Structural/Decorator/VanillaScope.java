

public class VanillaScope implements IceCreamConeConstituents {


    IceCreamConeConstituents icecream;

    public VanillaScope(IceCreamConeConstituents icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " " + "VanillaScope";
    }

}