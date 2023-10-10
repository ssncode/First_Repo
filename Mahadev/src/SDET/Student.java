package SDET;

public class Student {
	int RollNumber= 10;
	int Age= 11;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}
	public void display3() {
		System.out.println("Automation is very easy");
	}
	public void display4() {
		System.out.println("Automation is very easy");
	}
	public static void main (String[] args) {
		
		Student obj=new Student();
		obj.display1();
		obj.display2();
		obj.Age=23;
		System.out.println(obj.Age);
		obj.RollNumber= 6767;
		System.out.println(obj.RollNumber);
		
		
		
	}
}
