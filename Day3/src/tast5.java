import java.util.Scanner;

public class tast5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("X�� �Է��Ͻÿ�");
		int X = in.nextInt();
		System.out.println("Y�� �Է��Ͻÿ�");
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
