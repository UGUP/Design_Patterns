public class StrawberryScope implements IceCreamConeConstituents {


    IceCreamConeConstituents icecream;

    public StrawberryScope(IceCreamConeConstituents icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " " + "StrawberryScope";
    }

}