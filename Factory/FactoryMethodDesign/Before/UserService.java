//import javax.xml.crypto.Data;
//import java.awt.dnd.DropTarget;
//
//public class UserService {
//
//    static Database database;
//
//    public UserService(Database database){
//        this.database=database;
//    }
//
//      //Violation of SRP as well as open closed principle
//    void registerUser(){
//        Query query;
//        if(database.getType().equals(DatabaseType.MYSQL)){
//             query= new MySqlQuery();
//        }else{
//            query= new PostgresQuery();
//        }
//    }
//
//
//}
