package com.orgMaven;

public class Gift {
	void newyear() {
		System.out.println("sweets and chocolates");
	}

}
		
class badusha extends Gift{
	void sweets()
	{
		System.out.println("first student sweet");
		
	}
}
class laddu extends Gift{
	void sweets()
	{
		System.out.println("second student sweet");	
		}
}
class diarymilk extends Gift{
	void chocolate()
	{
		System.out.println("first student chocolate");
		
	}
}
class fivestar extends Gift{
	void chocolate()
	{
		System.out.println("second student chocolate");
		
	}
}
class Demo{
	public static void main(string arg[])
	{
		Gift g=new Gift();
		g.newyear();
		badusha b=new badusha();
		b.sweets();
		laddu l=new laddu();
		l.sweets();
		diarymilk d=new diarymilk();
		d.chocolate();
		fivestar s=new fivestar();
		s.chocolate();
		
		
	}
}