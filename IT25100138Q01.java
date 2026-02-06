public class IT25100138Q01{
	public static void main(String[]args){
		
		int miles = 26;
		int yards = 385;
		double kilometers;
		
		double milToKM = miles * 1.609;
		double yarToKM = (yards / 1760.0) * 1.609;

        kilometers = milToKM + yarToKM;
		
		System.out.println("Distance in kilometers: " + kilometers);

		
	}
}
