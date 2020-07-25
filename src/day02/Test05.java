package day02;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner consol=new Scanner(System.in);
		String in=consol.next();
		Date date=new Date();
		long time=date.getTime();
		String str="[.]+";
		String[] m=in.split(str);
		String xx=String.valueOf(time)+"."+m[1];
		System.out.println(xx);
	}
}
