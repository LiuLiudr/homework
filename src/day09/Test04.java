package day09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {

     Thread t=new Thread(){
         @Override
         public void run() {
             while (true){
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 Date date=new Date();
                 String time=df.format(date);
                 System.out.println(time);
             }
         }
     } ;
     t.start();
    }
}
