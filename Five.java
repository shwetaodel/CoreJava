package example;
import java.io.*;

public class Five {
	
	public static void count(String a)
	{
	char[] ch=a.toCharArray();
	int letter=0;
	int space=0;
	int num=0;
	int other=0;
	
	for(int i=0;i<a.length();i++)
	{
		if(Character.isLetter(ch[i]))
		{
			letter++;
		}
		else if(Character.isDigit(ch[i]))
		{
			num++;
		}
		else if(Character.isSpaceChar(ch[i]))
		{
			space++;
		}
		else	
		{
			other++;
		}
	}
	System.out.println("Space="+space+"\nletter="+letter+"\nnumber="+num+"\nother="+other);

	}

	public static void main(String[] args) throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String name=br.readLine();

		count(name);
	}

}
