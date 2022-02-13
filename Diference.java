import java.util.ArrayList;
import java.util.List;

public class Diference {
	public static void main(String[]args) {
		
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    int sum = 0;
	    int sum1 = 0;
	    for (int i = 0; i < arr.size(); i++)
	      for (int j = 0; j < arr.size(); j++) {
	         // Check for main diagonal element.
	         if (i == j) {
	            sum += arr.get(i).get(j);
	         }
	        
	         // Check for secondary diagonal element.
	         if (i + j == arr.size() - 1) {
	            sum1 += arr.get(i).get(j);
	         }
	         
	       }
	       if(sum-sum1<0){
	        return (sum-sum1)*-1;
	    }else{
	        return sum-sum1;
	    }

	    }
}
