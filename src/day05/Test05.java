package day05;

import java.util.*;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String in=console.next();
        Map<String,Integer>map=new LinkedHashMap<>();
        List<String> list=new ArrayList<>();
        list= putin(in);
        for(String ke:list){
            Integer value=map.get(ke);
            if(value==null){
                value=0;
            }
            map.put(ke,value+1);
        }
        System.out.println(map);
    }
    public static List<String> putin(String in){
        List<String> list=new ArrayList<>();
        String []arry1=in.split(";");
        for (int i=0;i<arry1.length;i++){
            String[] arry2=arry1[i].split(":");
            String key=arry2[0];
            list.add(key);
        }
        return list;
    }
}
