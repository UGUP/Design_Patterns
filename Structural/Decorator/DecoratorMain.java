
public class DecoratorMain {

    public static void main(String[] args) {
        IceCreamConeConstituents icecream= new ChocoChips(
                new VanillaScope(
                        new StrawberryScope(
                                new OrangeCone(
                                        new ChoclateCone()
                                )
                        )
                )
        );

        System.out.println(" the total cost of Icecream is "+icecream.getCost());
        System.out.println("The description of the icecream is "+icecream.getDescription());
    }
}
