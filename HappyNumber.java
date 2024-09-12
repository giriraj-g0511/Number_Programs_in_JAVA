
//Implement hashset for repeated value 
//only hashset implementation is required

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("Enter a Number");
			int no=sc.nextInt();
			if(isHappyNo(no)) {
				System.out.println(no+" is Happy Number");
			}
			else {
				System.out.println(no+" is not a Happy Number");
			}
	}
		private static boolean isHappyNo(int no) {
			 HashSet<Integer> hs = new HashSet<>();
			no=	spliteAdd(square(no));
			if(no==1) {
				return true;
			}
			else {
				return false;
			}
		}
		
		private static int square(int no) {
			return no*no;
		}
		
		private static int spliteAdd(int no) {
			int sum=0;
			while(no!=0) {
				int last=no%10;
				no/=10;
				sum+=square(last);
			}
			System.out.println(sum+" is a Splite Add Number");
			return sum;
		}
}
