import java.sql.SQLInvalidAuthorizationSpecException;

public class SingletonDesign {

    private static SingletonDesign sd;

    private SingletonDesign(){

    }
    public static SingletonDesign getInstance()  {
        try{
        if(sd==null){
            Thread.sleep(100);
           sd= new SingletonDesign();
            return sd;
        }else{
            return sd;
        }
    }catch (Exception e){
        }
        return null;
    }
}
