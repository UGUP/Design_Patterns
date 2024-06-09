public class FactoryMethodClient {

    public static void main(String[] args) {

        UserService service= new UserService(new MySqlDatabase());
    }
}
