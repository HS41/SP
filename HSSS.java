class HSSS 
{
	int x=m1();
	int m1()
	{
      System.out.println("NSV x");
	  return 50;
	}
	{

      System.out.println("NSB1");

	}
	static
	{

    System.out.println("I am first");     
	}

    HSSS()
	{

      System.out.println("No arg const");
	  x=80;
	  y=90;


	}

	public static void main(String[] args) 
	{
		System.out.println("main");
        HSSS h=new HSSS();
		System.out.println(h.x);
		System.out.println(h.y);
    
	}
	{

     System.out.println("NSB2");
     
	}

int y=m2();
int m2()
	{

System.out.println("NSV y");
return 80;

	}


}


