
public class ChocoChips implements  IceCreamConeConstituents{

    IceCreamConeConstituents icecream;

    public ChocoChips(IceCreamConeConstituents icecream){
        this.icecream= icecream;
    }

    @Override
    public int getCost(){
        return icecream.getCost()+2;
    }

    @Override
    public String getDescription(){

        return icecream.getDescription() + " " + "Chocochips";
    }
}
