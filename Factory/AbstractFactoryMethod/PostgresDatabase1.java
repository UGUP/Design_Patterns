public class PostgresDatabase1 implements  Database1{
    @Override
    public void seturl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType1 getType() {
        return DatabaseType1.POSTGRES;
    }

    @Override
    public DatabaseFactory createFactory() {
        return new PostgresFactory();
    }
}
