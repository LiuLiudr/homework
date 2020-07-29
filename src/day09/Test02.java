package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02  {
    public static void main(String[] args) {
        Mythread run=new Mythread();
        Thread t=new Thread(run,"一");
        Thread t2=new Thread(run,"二");
        t.start();
        t2.start();
    }
    public static class Mythread implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i <1000 ; i++) {
                System.out.println(Thread.currentThread().getName()+"你好再见");
            }
        }
    }
}
