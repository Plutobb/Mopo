public class Test {
    public static class MyRunnable implements Runnable{
        private int id ;

        public MyRunnable(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println(i+"---"+ id);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("1");


        MyRunnable myRunnable = new MyRunnable(1);
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyRunnable myRunnable2 = new MyRunnable(2);
        Thread thread1 = new Thread(myRunnable2);
        thread1.start();

    }
}
