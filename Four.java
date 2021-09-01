package example;
import java.io.*;

public class Four {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String name=br.readLine();
		int a=0;
		for(int i=0;i<name.length();i++)
		{
			a=i+1;
		}
		System.out.println(a);
	}

}
