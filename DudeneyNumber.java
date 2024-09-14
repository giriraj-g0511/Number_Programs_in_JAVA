import java.util.Scanner;

public class DudeneyNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		if(isDudeneyNo(no)){
			System.out.println(no+" is Dudeney Number");
		}
		else{
			System.out.println(no+" is not a Dudeney Number");
		}
	}

	public static boolean isDudeneyNo(int no){
		return digitSum(no*no*no)==no;
	}

	public static int digitSum(int n){
		int sum=0;
		while(n>0){
			int last=n%10;
			n/=10;
			sum+=last;
		}
		return sum;
	}
}