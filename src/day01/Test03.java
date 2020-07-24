package day01;

import java.util.Arrays;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 * 
 * @author Bonnie
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 编写一个回文字符串，然后调用check方法检查
		 * 该字符串是否为回文，然后输出检查结果。
		 * 若是回文则输出:是回文
		 * 否则输出:不是回文
		 */
		String m="上海自来水来自海上";
		System.out.println(check(m));

	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str){
		int count=0;
		int m=str.length();
		char[] str1=new char[m];
		char[] str2=str.toCharArray();//字符串变字符串数组
		for(int i=0;i<m;i++){
			str1[i]=str2[m-1-i];
		}
		for (int j=0;j<m;j++){
			count++;
			if(str1[j]!=str2[j]){
				break;
			}
		}
		if(count>=m){return true;
		}
		else return false;
	}
}
