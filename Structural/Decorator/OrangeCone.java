public class OrangeCone implements IceCreamConeConstituents{

    IceCreamConeConstituents icecream;

    public OrangeCone(){

    }

    public OrangeCone(IceCreamConeConstituents icecream){
        this.icecream=icecream;
    }


    @Override
    public int getCost(){
        if(icecream==null){
            return 10;
        }else{
            return icecream.getCost()+20;
        }
    }

    @Override
    public String getDescription(){
        if(icecream==null){
            return "OrangeCone";
        }else {
            return icecream.getDescription() + " " + "OrangeCone";
        }
    }
}
