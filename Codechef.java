import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long findMax(long a[],int l,int  r)
    {
        long max=-999999;
         for(int i = l; i <= r; i++){
                if(max<((a[i]-a[l])*(a[r]-a[i]))){
                    max=(a[i]-a[l])*(a[r]-a[i]);
                }
            }
 
            return max;
        
        
 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	  //int a[]=new int[1000001];
	  
	  Scanner scan= new Scanner(System.in);
	  int t;
	  t=scan.nextInt();
	  while(t-->0){
	  int N,Q;
	  int T,x,k;
	  //long k;
	  int i;
        N = scan.nextInt();
        Q = scan.nextInt();
        long a[]=new long[2000002];
          for(i = 1; i <= N; i++){
            a[i] = scan.nextInt();
        }
        while(Q-->0)
        {
             T = scan.nextInt();
            x = scan.nextInt();
            k = scan.nextInt();
            if(T==2){
            a[x]=k;
            continue;}
            System.out.println(findMax(a,x,k));
            
            
            
            
            
        } 
        }
	}
}