package SingletonPattern;

public class SingletonDoubleLock {
    public static SingletonDoubleLock instance;

    private SingletonDoubleLock() { }

    public static SingletonDoubleLock getInstance(){
        if (instance == null){
            synchronized (SingletonDoubleLock.class){
                if (instance == null){
                    instance = new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }

    //描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
    //getInstance() 的性能对应用程序很关键。
}
