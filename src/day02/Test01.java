package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        String str=m.next();
        String x="^[\\d]+$";
        String x1="^[\\d]+[.][\\d]+$";
        boolean q=str.matches(x);
        boolean p=str.matches(x1);
        System.out.println(p);
        if(q==true){
            int it=Integer.valueOf(str);
            System.out.println(it*10);
        }
        else if(p==true){
            Double a=Double.valueOf(str);
            System.out.println(a*5);
        }
        else System.out.println("不是数字");
    }
}
