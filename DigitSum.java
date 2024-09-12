import java.util.Scanner;

class DigitSum{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		System.out.println(DigitSum(sc.nextInt()));
	}

	public static int DigitSum(int no){
		int sum=0;
		while(no!=0){
			int last=no%10;
			no/=10;
			sum+=last;
		}
		return sum;
	} 
}