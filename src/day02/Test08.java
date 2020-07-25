package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner consol=new Scanner(System.in);
        int n=consol.nextInt();
        String name;
        int age;
        String gender;//性别
        int salary;//工资
        List<Person> list=new ArrayList<>();


      for(int i=0;i<n;i++){
            String person=consol.next();
            String[] xinxi=per(person);
            name=String.valueOf(xinxi[0]);
            age=Integer.parseInt(xinxi[1]);
            gender=String.valueOf(xinxi[2]);
            salary=Integer.parseInt(xinxi[3]);
            Person person1=new Person(name,age,gender,salary);
            list.add(person1);
        }
        System.out.println(list);
    }
    public static String[] per(String person){
        String stri="[;]";
        String []ff=person.split(stri);
        StringBuilder bui=new StringBuilder();
        for (int i=0;i<ff.length;i++){
            bui.append(ff[i]);
        }
        String oo=bui.toString();
        String str="[,]";
        String[] ovv=oo.split(str);
        return ovv;
    }
}
