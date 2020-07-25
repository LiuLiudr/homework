package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
         Scanner consol=new Scanner(System.in);
         int n=consol.nextInt();
         String name;
         int age;
         String gender;//性别
         int salary;//工资
         Date hiredate;//入职日期

        List<Emp> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String person=consol.next();
            String[] xinxi=per(person);
            name=String.valueOf(xinxi[0]);
            age=Integer.parseInt(xinxi[1]);
            gender=String.valueOf(xinxi[2]);
            salary=Integer.parseInt(xinxi[3]);
            hiredate=new SimpleDateFormat("yyyy-MM-dd").parse(xinxi[4]);
            Emp emp=new Emp(name,age,gender,salary,hiredate);

            while (list.contains(emp)){
                String na=emp.getName();
                System.out.println("请重新输入");
                person=consol.next();
                xinxi=per(person);
                if(na.equals(xinxi[0])==false){break;}
            }
            name=String.valueOf(xinxi[0]);
            age=Integer.parseInt(xinxi[1]);
            gender=String.valueOf(xinxi[2]);
            salary=Integer.parseInt(xinxi[3]);
            hiredate=new SimpleDateFormat("yyyy-MM-dd").parse(xinxi[4]);
            Emp emp1=new Emp(name,age,gender,salary,hiredate);
            list.add(emp1);
        }
        System.out.println(list);
    }
    public static String[] per(String person){
        String str="[,]";
        String[] ovv=person.split(str);
        return ovv;
    }
}
