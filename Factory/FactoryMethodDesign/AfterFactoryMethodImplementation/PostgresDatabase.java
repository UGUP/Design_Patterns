public class PostgresDatabase implements Database {
    @Override
    public void seturl() {

    }

    @Override
    public void getHostname() {

    }

    @Override
    public DatabaseType getType() {
        return DatabaseType.POSTGRES;
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}