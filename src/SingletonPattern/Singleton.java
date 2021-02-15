package SingletonPattern;

public class Singleton {
    //单例模式
    private static Singleton instance;
    private Singleton() { }

    //懒汉式实现，线程不安全版本
    //这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
    //这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    //懒汉式实现，线程安全版本;
    public static synchronized Singleton getInstance2(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
