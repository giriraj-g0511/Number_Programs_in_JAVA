import java.util.Scanner;

class SmithNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		if (isSmithNo(sc.nextInt())) {
		System.out.println("it is Smith Number");
		}
		else {
		System.out.println("it is not a Smith Number");
		}
	}

	public static boolean isSmithNo(int no){
		int digitSum=DigitSum.DigitSum(no);
		int primeFactorSum=primeFactorSum(no);
		return digitSum==DigitSum.DigitSum(primeFactorSum);
	}

	public static int primeFactorSum(int no){
		int sum=0;
		for (int i=2;i<=no/2 ;i++ ) {
			if(no%i==0){
				if (isPrime(i)) {
					sum+=i;
				}
			}
		}
		return sum;
	}

	public static boolean isPrime(int no){
		for (int i=2;i<=no/2 ;i++ ) {
			if(no%i==0){
				return false;
			}
		}
		return true;
	}
}