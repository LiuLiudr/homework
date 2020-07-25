package day02;

import java.util.Arrays;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String xx="123,456,789,012";
        String str=",+";
        String[] arry=xx.split(str);
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }
}
