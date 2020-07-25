package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner con=new Scanner(System.in);
        String ip=con.next();
        String str="^([0-9]){0,3}(.[0-9]{0,3}){3}$";
        String str1="\\.+";
        String[] arry=ip.split(str1);
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
}
