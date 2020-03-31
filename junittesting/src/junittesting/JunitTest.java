package junittesting;

public class JunitTest {
	public String deleteA(String str)
	{
		StringBuilder bui=new StringBuilder(str);
		if(str.charAt(0)=='a'||str.charAt(0)=='A')
		{
		bui.deleteCharAt(0);
		}
		 if(str.charAt(1)=='a'||str.charAt(1)=='A')
		{
		bui.deleteCharAt(0);
		}
		String obj1=bui.toString();
		return obj1;
	}
	

}
