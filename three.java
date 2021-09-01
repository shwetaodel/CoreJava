package example;
import java.io.*;

public class three {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String name=br.readLine();
		name=name.toLowerCase();
		int Count=0;
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				Count++;
			}
			
		}
		System.out.println("Number of vovels="+Count);
	}

}
