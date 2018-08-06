package janani;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
String str="";
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.nextLine();
n=ja.nextInt();
String a=str.substring(0,n);
System.out.println(a);
	}

}
