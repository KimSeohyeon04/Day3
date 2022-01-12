import java.util.Scanner;

public class tast5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("X를 입력하시오");
		int X = in.nextInt();
		System.out.println("Y를 입력하시오");
		int Y = in.nextInt();
		
		if(X > 0)
			if(Y > 0)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(4);
			}
		else 
		{
			if(Y > 0)
			{
				System.out.println(2);
			}
			else
			{
				System.out.println(3);
			}
		}
	}
}
