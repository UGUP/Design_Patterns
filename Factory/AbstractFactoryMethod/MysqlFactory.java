public class MysqlFactory implements DatabaseFactory{
    @Override
    public Query1 createQuery() {
        return new MsqlQuery1();
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
