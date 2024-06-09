public class MysqlDatabase1 implements  Database1{

    @Override
    public void seturl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType1 getType() {
        return DatabaseType1.MYSQL;
    }

    @Override
    public DatabaseFactory createFactory() {
        return new MysqlFactory();
    }
}
