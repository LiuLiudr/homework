package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Thread t=new Thread("一"){
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"你好再见");
                }
            }
        };
        Runnable run=new Runnable() {
            @Override
            public void run() {
                    for (int i = 0; i <1000 ; i++) {
                        System.out.println(Thread.currentThread().getName()+"你好再见");

                }
            }
        };
        Thread t2=new Thread(run,"二");
        t.start();
        t2.start();
    }

}
