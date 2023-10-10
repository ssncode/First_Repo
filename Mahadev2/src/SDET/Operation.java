package SDET;

public class Operation {
	int a;
	int b;
	public int sum(int a,int b)
	{
		int V1 =(a+b);
		return V1;
	}
	
	
	
	public int div(int a,int b)
	{
		int V3= (a/b);
		return V3;
	}
	public int mul(int a,int b)
	{
		int V4= (a*b);
		return V4;
		
	}

	public static void main (String[] args)
	{
		Operation obj= new Operation();
		int Sam= obj.sum(10,2);
		int Sam2= obj.sum(Sam, 2);
		int Sam3= obj.sub (Sam2, 2);
		int Sam4= obj.mul(Sam3, 2);
		int Sam5= obj.div(Sam4, 2);
		System.out.println(Sam5);
		
	}

	
}
