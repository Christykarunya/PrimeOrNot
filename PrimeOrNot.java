package week1.day1;

public class PrimeOrNot {

	public static void main(String[] args) {
		//To find whether the given no. is prime no. or not(prime no. can only be divisible by 1 and itself)
		//input=13;output=13 is prime no. 
		int p=13;
		boolean flag= false;
		for (int i = 2; i < p/2; i++) {
			if(p%i==0) {
			flag= true;
			break;
			}
		}
		if(flag==false) {
			System.out.println("The given number " + p + " is a Prime number");
		}
		else
		{
			System.out.println("The given number " + p + " is not a Prime number");
		}
	}

}
