import java.util.*;
class TestSorting
{
	public static void main(String[] args) 
	{
		String[] names={"HK","MB","BB","AB","SB"};
		System.out.println(Arrays.toString(names));

        sort(names);

		System.out.println(Arrays.toString(names));
	}


static void sort(String[] args){
	int len=args.length;

    for(int i=0;i<len;i++)
	{    
		
		for(int j=0;j<len-i-1;j++)
		{
			
			int k= (args[j]).compareTo(args[j+1]);
			if(k>0)
			{
                 String s=args[j];
				 args[j]=args[j+1];
				 args[j+1]=s;


			}
		}
	}
}
}