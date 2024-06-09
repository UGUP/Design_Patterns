public interface Database {

    void seturl();

    void getHostname();

    DatabaseType getType();

    //Factory Method
    Query createQuery();
}
