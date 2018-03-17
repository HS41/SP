class Example1 
{
	static int a=m1();
	static int m1(){
		Syatem.out.println("Example SV a-variable is created");
		return 50;
	}
	static{
		System.out.println("Example SB-class is loaded");
	}
	static void m2(){
		System.out.println("Example m2");
	}
	Example(){
		System.out.println("Example constructor-object is created");
	}
	public static void main(String [] args){
		System.out.println("Example main - execution started");
	}
}
class Sample
{
    static{
		System.out.println("Sample SB-class is loaded");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample main start");
		Example1                                    .m1();
		System.out.println("end of sample main");
	}
}
