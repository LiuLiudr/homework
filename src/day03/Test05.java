package day03;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String putin=console.next();
        String str="^[\\d]{17}[\\d|x]$";

        while (!putin.matches(str)){
            System.out.println("请重新输入");
            putin=console.next();
        }

        String[] nyr=getbirth(putin);

        Integer year=Integer.parseInt(nyr[0]);
        Integer mous=Integer.parseInt(nyr[1]);
        Integer day=Integer.parseInt(nyr[2]);

        putout(year,mous,day);

    }
    public static  String[] getbirth(String putin){
       String[] arry=new String[3];
       arry[0]=putin.substring(6,10);
       arry[1]=putin.substring(10,12);
       arry[2]=putin.substring(12,14);
       return arry;
    }
    public static void putout(int yrar,int mous,int day){
        Calendar nyr=Calendar.getInstance();
        nyr.set(Calendar.YEAR,yrar);
        nyr.set(Calendar.MONTH,mous-1);
        nyr.set(Calendar.DAY_OF_MONTH,day);
        nyr.add(Calendar.YEAR,20);

        nyr.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        SimpleDateFormat df=new SimpleDateFormat("yyy-MM-dd");
        Date date=new Date();
        date=nyr.getTime();
        String putout=df.format(date);
        System.out.println("当周的周三为:"+putout);
    }
}
