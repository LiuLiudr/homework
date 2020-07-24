package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		char[] arry = playIt();
		arry=playIt();
		System.out.println(arry);
		Scanner m=new Scanner(System.in);
		String come=m.next();
		System.out.println(chick(come,arry));
	}
	public static char[] playIt(){
		Scanner consol=new Scanner(System.in);
		Random uu=new Random();
		char[] arry=new char[5];
		for(int i=0;i<arry.length;i++){
			int m=uu.nextInt(5);
			if(m<=3){arry[i]=(char)(Math.random()*26+97);}
			else {arry[i]=(char)(Math.random()*26+'A');
			}
		}
		return arry;
	}
	public static boolean chick(String come,char[] arry){
		//String arry1=String.valueOf(arry);//字符数组转字符串
		String arry1=new String(arry);//字符数组转字符串
		if(arry1.equalsIgnoreCase(come)){
			return true;
		}else{
			return false;
		}
	}

}
