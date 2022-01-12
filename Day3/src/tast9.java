import java.util.Scanner;

public class tast9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("A의 갑은");
		int A = in.nextInt();
		System.out.println("B의 갑은");
		int B= in.nextInt();
		System.out.println("C의 갑은");
		int C = in.nextInt();
		
		if((B<A&&A<C)||(C<A&&A<B))
		{
			System.out.println("중간 값은"+A);
		}
		else if((A<B&&B<C)||(C<B&&B<A))
		{
			System.out.println("중간 값은"+B);
		}
		else
		{
			System.out.println("중간 값은");
		}
		in.close();
	}
}
