package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Mythread t=new Mythread("一");
        Mythread t1=new Mythread("二");
        t.start();
        t1.start();
    }
    public static class Mythread extends  Thread{
        String name;
        public Mythread(String name) {
            super();
            this.name=name;
        }
        @Override
        public void run() {
            for (int i = 0; i <1000 ; i++) {
                System.out.println(Thread.currentThread().getName()+"你好再见");
            }
        }
    }
}
