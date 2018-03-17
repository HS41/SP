class Bharat 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
               System.out.println("\nIn loop:"+i);
			   try{
				   System.out.println("In Try");
				   if(i==5){
					   break;
				   }

			   }
			   finally{
				   System.out.println("In finally");
			   }
		System.out.println("After try/finally");
		}
		System.out.println("After loop");
	}
}
