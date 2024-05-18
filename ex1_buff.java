package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//buffered reader is used for input only.
public class ex1_buff {
	public static void main(String args[]) throws Exception 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number first");
		String num1=br.readLine();
		System.out.println("Enter number second");
		String num2=br.readLine();
		System.out.println(num1 + num2);
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		System.out.println(a+b);
	}
}
