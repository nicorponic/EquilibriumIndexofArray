
package equilibriumshadowindexofarray;

public class EquilibriumShadowIndexOfArray {
    
    public static void main(String[] args) {

        int[] A = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};

        if (A.length <= 1) {
            System.out.println(-1);
        }
        int higherSum = 0;
        //briskei to highersum..
        for (int i = 0; i < A.length; i++) {
            higherSum += A[i];
        }
        int lowerSum = 0;
        
        for (int i = 0; i < A.length; i++) {
            // afairei apo to highersum ena ena ta indices
            higherSum -= A[i];
            // checkarei gia equilibrium
            if (higherSum == lowerSum) {
                
          System.out.println(i);
            }
            //prosthetei sto lowersum ena ena ta indices
            lowerSum += A[i];
        }
       

    }
  
    
    	public int solution1(int[] A) {

		int sum = 0;
		int i;
		int counter = 0;

		for (i = 0; i <= A.length;) {
			sum += A[i];
		}
		for (i = 0; i < A.length;) {
			if (A[i] == sum - A[i]) {
				counter += 1;
				return i;

			}
			if (counter == 0) {
				i= -1;

			}
		}
                return i;
	}
}
