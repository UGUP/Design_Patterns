import java.util.*;

public class Registry {

    HashMap<String, Notebook> map= new HashMap<>();

    public Notebook getInstance(String name){
        return  map.get(name).clone();
    }

    public void register(String name, Notebook instance){
        map.put(name,instance);
    }
}
