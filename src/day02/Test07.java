package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner con=new Scanner(System.in);
        String it=con.next();

        System.out.println(mutp(it));
    }

    public static double  mutp(String str){
        String str2="^[\\d]*[.]?[\\d]*[+][\\d]*[.]?[\\d]*$";
        String str3="^[\\d]*[.]?[\\d]*[-][\\d]*[.]?[\\d]*$";
        String str4="^[\\d]*[.]?[\\d]*[*][\\d]*[.]?[\\d]*$";
        String str5="^[\\d]*[.]?[\\d]*[/][\\d]*[.]?[\\d]*$";

        String str1="[+*/-]";
        String[] strArry=str.split(str1);

        Double num1=Double.parseDouble(strArry[0]);
        Double num2=Double.parseDouble(strArry[1]);
        if(str.matches(str2)){
            double all=num1+num2;
            return all;
        }
        else if(str.matches(str3)){
            double all=num1-num2;
            return all;
        }
        else if(str.matches(str4)){
            double all=num1*num2;
            return all;
        }
        else {
            double all=num1/num2;
            return all;
        }
    }


}
