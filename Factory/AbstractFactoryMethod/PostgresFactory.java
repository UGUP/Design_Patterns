public class PostgresFactory implements  DatabaseFactory{
    @Override
    public Query1 createQuery() {
        return new PostgresQuery1();
    }

    @Override
    public Query1 createTransaction() {
        return null;
    }

    @Override
    public Query1 createUpdate() {
        return null;
    }
}
