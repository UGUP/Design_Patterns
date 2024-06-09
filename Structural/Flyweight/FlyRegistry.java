import java.util.HashMap;

public class FlyRegistry implements FlyweightRegistry{

    HashMap<String, UserIntrinsicState> map = new HashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState flyweight){
        map.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email){
        return map.get(email);
    }

}
