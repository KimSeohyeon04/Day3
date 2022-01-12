import java.util.Scanner;

public class tast2 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("A를 입력하시오");
	int A = in.nextInt();
	System.out.println("B를 입력하시오");
	int B = in.nextInt();
	
	in.close();
	
	System.out.println(A+B);
	System.out.println(A-B);
	System.out.println(A*B);
	System.out.println(A/B);
	System.out.println(A%B);
	}
}