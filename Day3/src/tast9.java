import java.util.Scanner;

public class tast9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("A�� ����");
		int A = in.nextInt();
		System.out.println("B�� ����");
		int B= in.nextInt();
		System.out.println("C�� ����");
		int C = in.nextInt();
		
		if((B<A&&A<C)||(C<A&&A<B))
		{
			System.out.println("�߰� ����"+A);
		}
		else if((A<B&&B<C)||(C<B&&B<A))
		{
			System.out.println("�߰� ����"+B);
		}
		else
		{
			System.out.println("�߰� ����");
		}
		in.close();
	}
}
