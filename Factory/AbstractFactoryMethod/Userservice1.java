public class Userservice1 {

    Database1 database;

    public Userservice1(Database1 database){
        this.database= database;
    }

    void register(){
        Query1 query= database.createFactory().createQuery();
    }
}
