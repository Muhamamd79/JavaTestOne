package Program4;

import java.util.*;

public class Chocolate {
	public static void main(String[] args) 
	{
		System.out.println("Enter the Word");
		Scanner word=new Scanner(System.in);
		String word1 = word.nextLine();
		System.out.println("Enter the length you want of given word");
		Scanner num=new Scanner(System.in);
		int num1 = num.nextInt();
		if(num1>word1.length()) 
		{
			System.out.println("Wrong Lenght Entered");
		}
		else {
		Chocolate l=new Chocolate();
		l.repeatFront(word1,num1);
		}
		
		}
	public void repeatFront(String word,int n)
	{
		String AddedString="";
		//System.out.println(word+n);
		//int len=word.length();
		for(int i=n; i>=0; i--) 
		{
			
			String CutWord = word.substring (0,i);
			AddedString=AddedString+CutWord;
			//System.out.println(i);
		}
		System.out.println("OutPut Word is \""+AddedString+"\"");
	}
}
