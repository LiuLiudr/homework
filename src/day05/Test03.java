package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        List<Emp>list=new ArrayList<>();
        Scanner concol=new Scanner(System.in);
        String in=concol.next();
        list=putin(in);
        //System.out.println(list);
        Collections.sort(list);
        for(Emp e:list){
            System.out.println(e);
        }

    }
    public static List<Emp> putin(String in) throws ParseException {
        String[] arry1=in.split(";");
        List<Emp>list=new ArrayList<>();
        for(int i=0;i<arry1.length;i++){
            String[]arry2=arry1[i].split(",");
            String name=String.valueOf(arry2[0]);
            int age=Integer.parseInt(arry2[1]);
            String gender=String.valueOf(arry2[2]);
            int salary=Integer.parseInt(arry2[3]);
            Date hireDate=new SimpleDateFormat("yyy-MM-dd").parse(arry2[4]);
            list.add(new Emp(name,age,gender,salary,hireDate));
        }
        return list;
    }

}
