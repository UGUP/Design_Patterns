public class MySqlDatabase implements Database {

    @Override
    public void seturl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.MYSQL;
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }


}
