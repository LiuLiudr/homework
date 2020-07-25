package day02;
/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
     String str="123abc456def789ghi";
     String str1="[a-zA-Z]{1,4}+";
     String m=str.replaceAll(str1,"#char#");
        System.out.println(m);
    }
}
