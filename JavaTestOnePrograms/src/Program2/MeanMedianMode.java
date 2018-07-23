package Program2;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class MeanMedianMode {
	private Scanner x;
	
	public static void main(String[] args)
	{
		MeanMedianMode r=new MeanMedianMode();
		ArrayList<Double> allNumbers=new ArrayList<Double>(r.readFile());
		double x[] = new double[allNumbers.size()];
		for(int i = 0; i < x.length; i++){
		     x[i] = allNumbers.get(i);
		}
		
		Double mean1=r.mean(x);
		Double median1=r.median(x);
		Double mode1=r.mode(x);
		System.out.println("Mean of Numbers in File is = "+mean1);
		System.out.println("Median of Numbers in File is = "+median1);
		System.out.println("Mode of Numbers in File is = "+mode1);
	}

	public ArrayList<Double> readFile()
	{
		ArrayList<Double> numbers = new ArrayList<Double>();
		System.out.println("Please enter the File Path");
		Scanner path=new Scanner(System.in);
		String pathpath=path.nextLine();
		try {
		x=new Scanner(new File(pathpath));
		}
		catch(Exception e) 
		{
			System.out.println("File Not Found");
		}
		
		while(x.hasNext()) 
		{
			String number=x.next();
			if(number!=" ") {
			Double result =  Double.parseDouble(number);	
			numbers.add(result);
			}
		}
		System.out.println(numbers);
		//System.out.println(numbers.size());
		return numbers;	
	}
	public double mean(double[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }
	 public double median(double[] m) {
	        int middle = m.length/2;
	        if (m.length%2 == 1) {
	            return m[middle];
	        } else {
	            return (m[middle-1] + m[middle]) / 2.0;
	        }
	    }
	 public double mode(double a[]) {
	        double maxValue = 0, maxCount = 0;

	        for (int i = 0; i < a.length; ++i) {
	            int count = 0;
	            for (int j = 0; j < a.length; ++j) {
	                if (a[j] == a[i]) ++count;
	            }
	            if (count > maxCount) {
	                maxCount = count;
	                maxValue = a[i];
	            }
	        }

	        return maxValue;
	    }

}
