import java.util.*;
class Check 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		while(true){
		System.out.println("Enter String");
		String s = scn.nextLine();
		if(s.isEmpty())
		{
			System.out.println("String cannot be empty");
			continue;
		}

		else
		{   
			int calpha=0;
				int cupper=0;
				int clower=0;
				int cvowel=0;
				int cconso=0;
				int cdigit=0;
				int cspe=0;
				int cspace=0;
			int len=s.length();
			for(int i=0;i<len;i++)
			{   
				char ch=s.charAt(i);
				if(Character.isLetter(ch))
				{
					if(Character.isUpperCase(ch))
					{
						if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
							++cvowel;
					 else
						{
						 ++cupper;
					++cconso;
					++calpha;
					}
					}
					else
					{   
						if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
							++cvowel;
						else
						{++clower;
						++calpha;
						++cconso;
					}
					}
				}
				else if(Character.isDigit(ch))
				     ++cdigit;
			//	else if(ch==" ")
			//		++cspace;
				else
			++cspe;
			}
		
		
		
		
		System.out.println("No of alphabets:"+calpha);
		System.out.println("No of uppercasealphabets:"+cupper);
		System.out.println("No of lowercasealphabets:"+clower);
		System.out.println("No of vowels:"+cvowel);
		System.out.println("No of consonants:"+cconso);
		System.out.println("No of digits:"+cdigit);
		System.out.println("No of specialchar:"+cspe);
		//System.out.println("No of spaces:"+cspace);

		break;
		}
		}
	}
}
