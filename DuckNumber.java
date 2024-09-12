import java.util.Scanner;

class DuckNumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		if (isDuckNo(sc.next())) {
		System.out.println("It is a Duck Number");
		}
		else {
		System.out.println("It is not a Duck Number");
		}
	}

	public static boolean isDuckNo(String no){
		if(no.charAt(0)=='0'){
				return false;
			}
		for (int i=1;i<no.length() ;i++ ) {
			if(no.charAt(i)=='0'){
				return true;
			}
		}
		return false;
	}
}