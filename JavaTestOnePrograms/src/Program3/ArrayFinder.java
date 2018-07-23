package Program3;
import java.io.*;
import static java.lang.Long.*;
import static java.lang.Short.*;
import static java.lang.Short.*;
import static java.lang.Long.*;
 
public class ArrayFinder {
    public static void main(String[] args) {
    	int[] a= {1, 1, 2, 3, 1};
    	int[] b= {1, 1, 2, 4, 1};
    	int[] c= {1, 1, 2, 3, 1};
    	
    	System.out.println(array123(a));
    	System.out.println(array123(b));
    	System.out.println(array123(c));
    	
    }
    
    public static boolean array123(int[] nums) {
        boolean result = false;
        for(int i=0; i < nums.length-2; i++){
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                result = true;
                break;
            }
        }
        return result;
    }
    
}
