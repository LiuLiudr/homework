package day02;

import java.util.ArrayList;
import java.util.Arrays;
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
        ArrayList<String> name=new ArrayList<>();
        Scanner scon=new Scanner(System.in);
        String xx="[\\u4e00-\\u9fa5]{2,4}[,][\\d]{2}[,][\\u4e00-\\u9fa5][,][\\d]{2,4}[;]";
        String ff=scon.next();
        System.out.println(ff.matches(xx));
        while (ff.matches(xx)){
            name.add(ff);
            ff=scon.next();
        }
        System.out.println(name);

    }

}
