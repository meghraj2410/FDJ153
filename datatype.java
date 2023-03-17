class A
{
	int i;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean bo;
	byte by;

public void m1()
{
	System.out.println("Hello");
}
public void m2()
{
      System.out.println("Primitive Data Types");
}
public void m3()
{
      System.out.println("Non-primitive Data Types");
}
public static void main(String[] args)
{
	System.out.println("Hii");
	A a = new A();
	a.m1();
      a.m2();
      a.m3();
	System.out.println(a.i);
	System.out.println(a.s);
	System.out.println(a.l);
	System.out.println(a.f);
	System.out.println(a.d);
	System.out.println(a.c);
	System.out.println(a.bo);
	System.out.println(a.by);
}
}