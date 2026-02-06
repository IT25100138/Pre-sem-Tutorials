class EvenOddNumber {

   
    public boolean findEvenOrOdd(int i) {
	
        return i % 2 == 0; // true if even, false if odd
    }
}

public class IT25100138Q03{
	public static void main(String[]args){
		
		EvenOddNumber checker = new EvenOddNumber();

       
        int[] numbers = {10, 15, 22, 37, 40};

        
        for (int num : numbers) {
            if (checker.findEvenOrOdd(num)) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
		
		 
		
	}
}