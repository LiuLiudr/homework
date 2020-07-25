package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
   public static void main(String[] args) throws ParseException {
       Scanner con=new Scanner(System.in);
       String birth=con.next();
       Date date=new Date();
       Date birthdate=new SimpleDateFormat("yyyy-MM-dd").parse(birth);
      // System.out.println(birthdate);
       long time1=birthdate.getTime();
       long time2=date.getTime();
       long week=(time2-time1)/(7l*24*60*60*1000);
       System.out.println("到现在为止经过了"+week+"周");
   }
}
