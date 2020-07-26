package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df=new SimpleDateFormat("yyy-MM-dd");
        List<Emp>list=new ArrayList<>();
        Scanner consol=new Scanner(System.in);
        String input=consol.next();
        list=arryList(input);
        for(Emp emp:list){
            System.out.println(emp.toString());
        }
        for(Emp emp:list){
           Date date=emp.getHiredate();
           Calendar cal=Calendar.getInstance();
           cal.setTime(date);
           cal.add(Calendar.MONTH,3);
           cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
           date=cal.getTime();
           String dateout=df.format(date);
            System.out.println(emp.getName()+"的转正日期是"+dateout);
        }
    }
    public static List<Emp> arryList(String str) throws ParseException {
        List<Emp>list1=new ArrayList<>();
        String[] strlift=str.split(";");

        for(int i=0;i<strlift.length;i++){
            String[] arr=strlift[i].split(",");
            String name=String.valueOf(arr[0]);
            int age=Integer.parseInt(arr[1]);
            String gender=String.valueOf(arr[2]);
            int salary=Integer.parseInt(arr[3]);
            Date hiredate=new SimpleDateFormat("yyyy-MM-dd").parse(arr[4]);
            list1.add(new Emp(name,age,gender,salary,hiredate));
        }

        return list1;
    }

}
