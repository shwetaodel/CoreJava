package example; 
import java.io.*;

//print character position
public class two 
{
	public static void main(String[] args) throws IOException
	{		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String name=br.readLine();
		System.out.println("enter the position");
		int num=Integer.parseInt(br.readLine());
		System.out.println("character is="+name.charAt(num));
	}
}	