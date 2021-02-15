package SingletonPattern;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.print();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
