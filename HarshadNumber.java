import java.util.Scanner;

public class HarshadNumber {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		if(isHarshadNo(no)) {
			System.out.println(no+" is a Harshad Number");
		}
		else {
			System.out.println(no+" is Not a Harshad Number");
		}

	}
	
	public static boolean isHarshadNo(int no) {
		return (no%spliteAdd(no))==0;
	}

	public static int spliteAdd(int no) {		
		int sum=0;
		while(no>0) {
			int last=no%10;
			no/=10;
			sum+=last;
		}
		return sum;
	}

}
