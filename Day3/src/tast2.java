import java.util.Scanner;

public class tast2 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("A�� �Է��Ͻÿ�");
	int A = in.nextInt();
	System.out.println("B�� �Է��Ͻÿ�");
	int B = in.nextInt();
	
	in.close();
	
	System.out.println(A+B);
	System.out.println(A-B);
	System.out.println(A*B);
	System.out.println(A/B);
	System.out.println(A%B);
	}
}