class Mayank 
{
	static Mayank s;
	public static void main(String[] args) throws InterruptedException
	{
		Mayank m=new Mayank();
		System.out.println(m.hashCode());
		m=null;
		System.gc();
		//Thread.sleep(1000);
        System.out.println(s.hashCode());
		s=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("end of main");
	}
	public void finalize()
	{

        System.out.println("finalize called");
		s=this;



	}
}
