package lab10;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	void test() {
		testPositive();
		testNegatives();

	}
	SelectionSort sort = new SelectionSort();

	public void testPositive(){
	        int[] arr = new int[]{8,9,7,10,2};
	        int[] res = new int[]{2,7,8,9,10};
	        sort.basicSelectionSort(arr);
	        assert(Arrays.equals(arr,res));
	    }

	    @Test
	 public void testNegatives(){
	        int[] arr = new int[]{-8,-9,-7,-10,-2};
	        int[] res = new int[]{-10,-9,-8,-7,-2};
	        sort.basicSelectionSort(arr);
	        assert(Arrays.equals(arr,res));
	    }
			

}
