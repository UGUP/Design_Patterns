public class ChoclateCone implements IceCreamConeConstituents{

    IceCreamConeConstituents icecream;

    public ChoclateCone(){

    }

    public ChoclateCone(IceCreamConeConstituents icecream){
        this.icecream=icecream;
    }


    @Override
    public int getCost(){
        if(icecream==null){
            return 10;
        }else{
            return icecream.getCost()+10;
        }
    }

    @Override
    public String getDescription(){
        if(icecream==null){
            return "ChoclateCone";
        }else {
            return icecream.getDescription() + " " + "ChoclateCone";
        }
    }
}
