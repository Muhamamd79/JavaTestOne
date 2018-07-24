package Program5;

import java.util.Arrays;

public class ScoringTest {
	public static void main(String[] args) 
	{
		String[] ans1=new String[] {"a", "c", "b", "c"};
		String[] ans2=new String[] {"a", "a", "b", "c"};
		String[] ans3=new String[] {"a", "a", "b", "b"};
		String[] key=new String[] {"a", "a", "b", "b"};
		ScoringTest l=new ScoringTest();
		//ans= {"a", "a", "b", "b"};
		
		//System.out.println(ans.length);
		l.scoreUp(ans1,key);
		l.scoreUp(ans2, key);
		l.scoreUp(ans3, key);
			
	}
	
	public void scoreUp(String[] ans,String[] key)
	{
		//System.out.println(ans.length+" "+key.length);
		System.out.println("Your Answer was "+Arrays.toString(ans));
			
		
		int total,add,sub;
		total=add=sub=0;
		for(int i=0;i<4;i++)
		{
			
			if(ans[i]==key[i])
			{
				total+=4;
				
			}
			else if(ans[i]=="?") 
			{
				
			}
			else
			{
				total-=1;
			}
		}
		System.out.println("Score is = "+total);
	}

}
