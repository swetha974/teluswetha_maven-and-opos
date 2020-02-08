package com.orglearningMaven.myproject;

public class Gift {
	system.out.print("sweets and chocolate");

}
class badusha extends Gift{
	void sweets() {
		System.out.println("first student sweet");
		
	}
}
class laddu extends Gift{
	void sweet() {
		system.out.println("second student sweet");
	}
}
class diarymilk extends Gift{
	void chocolate() {
		System.out.println("first student chocolate");
	}
}
class fivestar extends Gift{
	void  chocolate() {
		system.out.println("second student chocolate");
	}
}
class Demo{
	public static void main(string arg[])
	{
		Gift g=new Gift();
		g.sweets();
		g.chocolate();
	}
}

