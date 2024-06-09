public class SingletonMain {

    public static void main(String[] args) {
       SingletonDesign sd=  SingletonDesign.getInstance();
       //it's returning the same object again and again
       System.out.println(sd);

       // checking multithreading

        Thread[] threads= new Thread[1000];

        for(int i=0;i<threads.length;i++){
            threads[i]= new Thread(new testSingletonMultithreading());
            threads[i].start();
        }
    }

}


class testSingletonMultithreading implements  Runnable{
    @Override
    public  void run(){
        SingletonDesign instance= SingletonDesign.getInstance();
        System.out.println("Thread "+Thread.currentThread().getName()+" has a singleton hashcode as "+instance.hashCode());
    }
}
