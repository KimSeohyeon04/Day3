import java.util.Scanner;

public class tast3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("A�� �Է��Ͻÿ�");
		int A = in.nextInt();
		System.out.println("B�� �Է��Ͻÿ�");
		int B = in.nextInt();
		
		if(A>B)
		{
			System.out.println(">");
		}
		else if(A<B)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("==");
		}
	}

}
