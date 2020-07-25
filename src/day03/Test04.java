package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner consol=new Scanner(System.in);
        int proDay=consol.nextInt();
        String nyr=consol.next();
        Date datenyr=new SimpleDateFormat("yyyy-MM-dd").parse(nyr);

        Calendar calnyr=Calendar.getInstance();
        calnyr.setTime(datenyr);

        calnyr.add(Calendar.DATE,proDay);
        int mous=calnyr.get(Calendar.WEEK_OF_MONTH);
        calnyr.set(Calendar.WEEK_OF_MONTH,mous-2);
        calnyr.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);

        SimpleDateFormat df=new SimpleDateFormat("yyy-MM-dd");
        Date date=calnyr.getTime();
        String str=df.format(date);
        System.out.println(str);
    }
}
