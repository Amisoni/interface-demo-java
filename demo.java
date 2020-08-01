interface abc
{
	void sum(int x,int y);

}

interface pqr
{
	void sub(int x,int y);
	
}

class xyz implements abc,pqr
{
	public void sum(int x,int y)
	{
		System.out.println("Sum Is:"+(x+y));
	}
	public void sub(int x,int y)
	{
		System.out.println("Sub Is:"+(x-y));
	}
}
class demo
{
	public static void main(String args[])
	{
		abc a=new xyz();
		a.sum(10,20);

		pqr p=new xyz();		
		p.sub(20,10);
	}
}