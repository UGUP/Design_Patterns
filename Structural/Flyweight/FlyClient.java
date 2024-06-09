public class FlyClient {

    public static void main(String[] args) {

        FlyRegistry registry= new FlyRegistry();
        UserIntrinsicState userIntrinsicState= new UserIntrinsicState();
        userIntrinsicState.setAge(12);
        userIntrinsicState.setName("upma");
        userIntrinsicState.setEmail("upma121gupta@gmail.com");
        userIntrinsicState.setPhoneNumber("97319165484");
        registry.addFlyweight(userIntrinsicState);

        UserExtrinsicState extrinsicState= new UserExtrinsicState();
        extrinsicState.setUserIntrinsicState(registry.getFlyweight("upma121gupta@gmail.com"));
        extrinsicState.setColour(Colour.BLACK);
        System.out.println(extrinsicState);


    }
}
