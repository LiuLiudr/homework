package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String in=console.next();
        Map<String,Integer>map=new LinkedHashMap<>();
        map=putin(in);
        //System.out.println(map);
        System.out.println("物理成绩为:"+map.get("物理"));
        map.remove("英语");

        Set<String>keys=map.keySet();
        for (String key:keys) {
            int value=map.get(key);
            System.out.println(key+":"+value);
        }

        Set<Map.Entry<String,Integer>>entrySet=map.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet){
            String key=entry.getKey();
            int value=entry.getValue();
            System.out.println(key+":"+value);
        }

        Collection<Integer>value=map.values();
        for(Integer va:value){
            System.out.println(va);
        }
    }
    public static Map<String,Integer> putin(String in){
        Map<String,Integer>map=new LinkedHashMap<>();
        String[] arry1=in.split(";");
        for(int i=0;i<arry1.length;i++){
            String[] arry2=arry1[i].split(":");
            String key=arry2[0];
            int value=Integer.valueOf(arry2[1]);
            map.put(key,value);
        }
        return map;
    }
}
