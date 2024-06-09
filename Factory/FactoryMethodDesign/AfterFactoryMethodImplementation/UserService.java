public class UserService {

     Database database;

    public UserService(Database database){
        this.database=database;
    }

      // No Violation of SRP as well as open closed principle
    void registerUser(){
        Query query= database.createQuery();
    }


}
