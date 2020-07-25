package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        List<String> mx=new ArrayList<>();
        mx.add("one");
        mx.add("two");
        mx.add("three");
        num(mx);
       isContain(mx);
       isEmpty(mx);
       mx.clear();
       num(mx);
       isEmpty(mx);


    }
    public static void num(List s){
        System.out.println(s.size());
    }
    public static void isContain(List mx){
        int m=1;
        for(int i=0;i<mx.size();i++){
            if(mx.get(i)=="four"){
                m=0;
            }
        }
        if(m==0){
            System.out.println("包含four");
        }else {
            System.out.println("不包含four");
        }
    }

    public static void isEmpty(List mx){
        if(mx.size()==0){
            System.out.println("不包含任何元素素");
        }else {
            System.out.println("里面包含元素");
        }
    }
}
