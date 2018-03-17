import java.util.*;
class TestSorting2
{
	public static void main(String[] args) 
	{
		StringBuffer names=new StringBuffer("mom");
		System.out.println(names);

        StringBuffer str = reverse(names);
        
        String b = new String(str);
		System.out.println(b);

		if(b.contentEquals(names))
           System.out.println("palindrome string");
		else
			System.out.println("not a palindrome");
	}


static StringBuffer reverse(StringBuffer args){
	int len=args.length();
    StringBuffer s = new StringBuffer();
    for(int i=len-1;i>=0;i--)
	{    
                 char ch = args.charAt(i);
                 s.append(ch);
				 
	   //  char ch1 = args.charAt(i);
	     //char ch2 = args.charAt(len-i-1);
           //      char s=args.charAt(i);
			//	args.charAt(i)=args.charAt(len-i-1);
			//	args.charAt(len-i-1)=s;


			}
		
	return s;
}
}