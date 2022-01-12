import java.util.Scanner;

public class tast8 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("두자리 수를 입력하세요");
		int jumsu = in.nextInt();
		
		if(jumsu % 11 == 0)
		{
			System.out.println("Yes ! 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("No ! 10의 자리와 1의 자리가 같지않습니다.");
		}
	}
}
