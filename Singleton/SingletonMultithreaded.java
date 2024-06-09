


public class SingletonMultithreaded {
    private static SingletonMultithreaded db;
    private SingletonMultithreaded(){

    }

    public static SingletonMultithreaded getInstance(){
       //double check locking mechanism
        if(db==null){
            synchronized (SingletonMultithreaded.class){
                if(db==null) {
                    db = new SingletonMultithreaded();
                }
            }

        }
        return db;
    }
}
